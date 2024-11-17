package LabDesignPatterns.Singleton;

/**
 * Singleton lazyholder
 * @author Mauricio
 */

public class SingletonLazyHolder {
    
    private class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}