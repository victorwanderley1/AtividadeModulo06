package atividademodulo06;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Criando uma lista de chamada com a visualização do nome do aluno
 * e de suas presenças.
 * @author Victor
 */
public class AtividadeModulo06 {

    public static void main(String[] args) {
        List<String> alunos = new ArrayList();
        
        alunos.add("Lucas");
        alunos.add("Eslovênia");
        alunos.add("Caio");
        alunos.add("Joana");
        alunos.add("Yasmim");
        alunos.add("Roberto");
        alunos.add("Nivaldo");
        alunos.add("Bartira");
        
        Aluno aluno1 = new Aluno("Victor", 10);
        
        aluno1.presencaAluno(3, true);
        aluno1.presencaAluno(6, true);
        aluno1.presencaAluno(8, true);
        aluno1.presencaAluno(19, true);
        
        aluno1.getDiasEstudados();
    }
    
}
