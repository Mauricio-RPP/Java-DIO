import java.util.Scanner;

public class VelocidadeMedia {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int i = 0;
        double media = 0;
        for (String v: velocidades) {
          total+=Integer.parseInt(v.trim());
          i+=1;
        }
        media = (double) total / i;
        return media;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();
        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");
        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);
        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");
        scanner.close();
    }
}


// velocidade e queda
import java.util.Scanner;
public class Main {
    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        String resultado = "Sem Quedas";
        for (String v : velocidades) {
        if (Integer.parseInt(v.trim()) == 0) {
            resultado = "Queda de Conexao";
            break;
        }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();
        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");
        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);
        // Exibindo o resultado da verificação
        System.out.println(resultado);
        scanner.close();
    }
}

