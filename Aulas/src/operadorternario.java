public class operadorternario {
    public static void main(String[] args){
        int a, b;
        a = 5;
        b = 5;
        String resultado = "";
        resultado = a==b?"Igual":"Diferente";
        System.out.println(resultado);

        String nomeUm = "Mauricio";
        String nomeDois = "Mauricio";
        System.out.println("String iguais: " + (nomeUm==nomeDois));
        String nomeTres = "Mauricio";
        String nomeQuatro = new String("Mauricio");
        System.out.println("String vs objeto :" + (nomeTres==nomeQuatro));
        System.out.println("String e conteúdo do objeto :" + nomeTres.equals(nomeQuatro));
    }
}