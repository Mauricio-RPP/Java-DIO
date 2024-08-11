public class App {
    public static void main(String[] args) throws Exception {
        int num = 101;
        num = soma(num,2);
        String teste = "aaa";
        System.out.println("Hello, WSL! " + num);
    }

    public static int soma (int num1, int num2) {
        return num1 + num2;       
    }
}
