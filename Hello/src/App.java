public class App {
    public static void main(String[] args) throws Exception {
        int num =2;
        num = soma(num,3);
        System.out.println("Hello, WSL! " + num);
    }

    public static int soma (int num1, int num2) {
        return num1 + num2;       
    }
}
