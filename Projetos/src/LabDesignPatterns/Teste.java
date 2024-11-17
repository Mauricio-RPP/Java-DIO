package LabDesignPatterns;

import LabDesignPatterns.Singleton.SingletonEager;
import LabDesignPatterns.Singleton.SingletonLazy;
import LabDesignPatterns.Singleton.SingletonLazyHolder;
import LabDesignPatterns.Strategy.Comportamento;
import LabDesignPatterns.Strategy.ComportamentoAgressivo;
import LabDesignPatterns.Strategy.ComportamentoDefensivo;
import LabDesignPatterns.Strategy.ComportamentoNormal;
import LabDesignPatterns.Strategy.Robo;
import LabDesignPatterns.Facade.Facade;

public class Teste {

    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);

        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCLiente("Mauricio", "123");

    }
}
