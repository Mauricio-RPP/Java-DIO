package iPhone;

public interface NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("adicionarNovaAba");
    }
    public void atualizarPagina(){
        System.out.println("atualizarPagina");
    }
}
