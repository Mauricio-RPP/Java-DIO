package iPhone;
//import iPhone.iPhone; //import opcional pois está no mesmo pacote, mas precisa para pastas diferentes
public class celular1 {
    public static void main(String[] args) {
        iPhone celular = new iPhone();
        celular.ligar("123");
        celular.adicionarNovaAba();
        celular.selecionarMusica("Hello");
    }
}
