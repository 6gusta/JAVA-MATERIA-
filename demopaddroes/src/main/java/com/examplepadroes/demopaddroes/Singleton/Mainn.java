package com.examplepadroes.demopaddroes.Singleton;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examplepadroes.demopaddroes.Factory.Factory;
import com.examplepadroes.demopaddroes.Factory.Factoryserver;

public class Mainn {
    public static void main(String[] args) {
        Config config = Config.getInstancia();
        config.exibirConfig();

        // Tentando obter uma nova instância, mas o Singleton garante que será a mesma
        Config outraConfig = Config.getInstancia();
        outraConfig.exibirConfig();

    }
}
