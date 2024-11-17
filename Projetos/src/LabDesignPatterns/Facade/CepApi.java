package LabDesignPatterns.Facade;

public class CepApi {

    private static CepApi instancia =  new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String buscaCidade(String cep){
        return "Campinas";
    }

    public String buscaEstado(String cep){
        return "SP";
    }
}


