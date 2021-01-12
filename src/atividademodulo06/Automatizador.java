package atividademodulo06;
import java.util.*;
/**
 *
 * @author Victor-Vanessa
 */
public class Automatizador {
 protected Boolean randomizadorBoolean(){
     double resultado =  (int)(Math.random()*100);
     if(resultado%2 == 0){
         return true;
     }else return false;
 } 
 
 public void frenquenciaAutomatica(List<Aluno> listaDeAluno){
     for (int i = 0; i<listaDeAluno.size(); i++){
         for (int dia = 0; dia<listaDeAluno.get(i).getDiasLetivos(); dia++){
             listaDeAluno.get(i).presencaAluno(dia, randomizadorBoolean());
         }
     }
 } 
}
