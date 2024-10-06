import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: importar e instanciar scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");

        //TODO: exibir as mensagens para o usuário
        //TODO: obter valores pela scanner
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o Nome Cliente !");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o Saldo !");
        double saldo = scanner.nextDouble();
        scanner.close();

        //TODO: exibir mensagem final
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
