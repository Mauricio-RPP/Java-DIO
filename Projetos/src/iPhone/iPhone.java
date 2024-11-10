package iPhone;


public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz(){
        System.out.println("iniciarCorreioVoz");
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("adicionarNovaAba");
    }
    public void atualizarPagina(){
        System.out.println("atualizarPagina");
    }
    public void tocar() {
        System.out.println("Tocando música");
    }
    public void pausar(){
        System.out.println("Pausando música");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionou música:" + musica);
    }
}