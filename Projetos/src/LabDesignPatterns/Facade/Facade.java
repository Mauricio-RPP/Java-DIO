package LabDesignPatterns.Facade;

//import LabDesignPatterns.Facade.CrmService;
//import LabDesignPatterns.Facade.CepApi;
//como se importasse de outros packages/projetos

public class Facade {
    // essa classe consolida outras classes para criar uma façada mais simples, abstraindo a complexidade de outras classes
    public void migrarCLiente(String nome, String cep){
        String cidade = CepApi.getInstancia().buscaCidade(cep);
        String estado = CepApi.getInstancia().buscaEstado(cep);

        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
