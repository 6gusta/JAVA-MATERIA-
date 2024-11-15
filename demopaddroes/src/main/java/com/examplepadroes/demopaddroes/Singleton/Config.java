package com.examplepadroes.demopaddroes.Singleton;

public class Config {
    private static Config instancia;


    private Config() {
        System.out.println("Configuração inicial carregada!");
    }

     public static Config getInstancia() {
        if (instancia == null) {
            instancia = new Config();
        }
        return instancia;
    }

    public void exibirConfig() {
        System.out.println("Exibindo configurações...");
    }
}

