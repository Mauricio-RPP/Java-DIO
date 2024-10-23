package contador;
import java.util.Scanner;

public class Contadora {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Entre primeiro nro: ");
        int numInicial = terminal.nextInt();
        System.out.println("Entre segundo nro: ");
        int numFinal = terminal.nextInt();
        try {
            contar (numInicial, numFinal);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo deve ser maior que o primeiro");
        }
        terminal.close();
    }

    static void contar(int ini, int fim) throws ParametrosInvalidosException {
        if (ini > fim)
            throw new ParametrosInvalidosException();
        else 
            for (int i = ini ; i <= fim; i++)
                System.out.println(i);
    }
}
