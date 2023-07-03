package org.example;

public class Singleton {

    // static = variable de la classe = Class.var
    // non static = variable d'instance = this.var
    private static Singleton instance;
    public Singleton() {
    }

    public static Singleton getInstance() {
        if (Singleton.instance == null)
            Singleton.instance = new Singleton();
        return instance;
    }
}
