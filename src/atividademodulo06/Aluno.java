package atividademodulo06;

/**
 *
 * @author Victor-Vanessa
 */
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private final Integer diasLetivos;
    private Boolean[] diasEstudados;
    
    public Aluno(String nome, Integer diasLetivos){
        this.nome = nome;
        this.diasLetivos = diasLetivos;
        this.diasEstudados = new Boolean[diasLetivos];
        for(int i = 0; i<diasLetivos; i++){
            this.diasEstudados[i] = false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getDiasLetivos(){
        return diasLetivos;
    }
    
    public void getDiasEstudados() {
        System.out.print(getNome() + ": ");
        int dia = 0;
        for (boolean presenca: diasEstudados){
            dia++;
            System.out.print("Dia " + dia + " - " + presencaEmString(presenca));
        }
        System.out.println("");
    }
    
    private String presencaEmString (Boolean presenca){
        if (presenca == true) return "Presente ";
        else return "Faltou ";
    }

    public void presencaAluno(int dia, Boolean presenca) {
        if (seDiaMenorQueDiasLetivos(dia)){
            this.diasEstudados[dia] = presenca;
        }
    }
    
    
    public Boolean seDiaMenorQueDiasLetivos (int dia){
        return dia <= diasLetivos;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.nome);
    }
}
