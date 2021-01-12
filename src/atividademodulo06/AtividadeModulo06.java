package atividademodulo06;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Criando uma lista de chamada com a visualização do nome do aluno
 * e de suas presenças.
 * @author Victor
 */
public class AtividadeModulo06 {

    public static void main(String[] args) {
        List<Aluno> turmaCursoJava = new ArrayList();        
        Automatizador automatizador = new Automatizador();
        
        turmaCursoJava.add(new Aluno("João", 30));
        turmaCursoJava.add(new Aluno("Wendel", 30));
        turmaCursoJava.add(new Aluno("Fernanda", 20));
        turmaCursoJava.add(new Aluno("Gabriela", 30));
        turmaCursoJava.add(new Aluno("Amanda", 18));
        turmaCursoJava.add(new Aluno("Benardo", 19));
        turmaCursoJava.add(new Aluno("Fabrício", 25));
        turmaCursoJava.add(new Aluno("Mariana", 30));
        turmaCursoJava.add(new Aluno("Lindalva", 30));
        Collections.sort(turmaCursoJava);
        automatizador.frenquenciaAutomatica(turmaCursoJava);
        
        for (int i = 0; i<turmaCursoJava.size(); i++){
         turmaCursoJava.get(i).getDiasEstudados();
     }
                
        
    }
    
}
