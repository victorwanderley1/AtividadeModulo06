package atividademodulo06;

/**
 *
 * @author Victor-Vanessa
 */
public class Aluno {
    private String nome;
    private final Integer diasLetivos;
    private Boolean[] diasEstudados;
    
    public Aluno(String nome, Integer diasLetivos){
        this.nome = nome;
        this.diasLetivos = diasLetivos;
        this.diasEstudados = new Boolean[diasLetivos];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean[] getDiasEstudados() {
        return diasEstudados;
    }

    public void setDiasEstudados(Boolean[] diasEstudados) {
        this.diasEstudados = diasEstudados;
    }
    
    public void alunoPresente (int dia){
        if (seDiaMenorQueDiasLetivos(dia)){
            diasEstudados[dia] = true;
        }
    }
    
    public Boolean seDiaMenorQueDiasLetivos (int dia){
        return dia <= diasLetivos;
    }
}
