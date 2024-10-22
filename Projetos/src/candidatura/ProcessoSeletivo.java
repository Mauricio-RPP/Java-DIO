package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
    System.out.println("Processo Seletivo");
    //analisarCandidato(1900);
    //analisarCandidato(2200);
    //analisarCandidato(2000);
    //selecaoCandidatos();
    //imprimirSelecionados();
    String [] candidatos = {"Felipe", "Marcia", "Claudia", "Maria1", "Maria2", "Maria3"};
    for (String candidato: candidatos) {
        fazerContato(candidato);
    }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Claudia", "Maria1", "Maria2", "Maria3"};
        System.out.println("Imprimindo lista informando índice");
        for (int indice=0;indice<candidatos.length;indice++){
            System.out.println("Cand nr " + (indice+1) + " é o " + candidatos[indice]);
        }
        for (String candidato:candidatos) {
            System.out.println("Candidato atual: " + candidato);
        }
    }
 

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Claudia", "Maria1", "Maria2", "Maria3", "Maria4", "Maria5"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 4 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("Candidato " + candidato + " solicitou " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("Candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    
    static void fazerContato(String candidato){
        int tentativas = 1;
        boolean continua = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continua = !atendeu;
            if (continua)
                tentativas++;
            else
                System.out.println("Contato realizado");
        } while (continua && tentativas <= 3);
        if (atendeu)
            System.out.println("Contatamos " + candidato + " após " + tentativas + " tentativas");
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase==salarioPretendido){
            System.out.println("Ligar para candidato com contraproposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
