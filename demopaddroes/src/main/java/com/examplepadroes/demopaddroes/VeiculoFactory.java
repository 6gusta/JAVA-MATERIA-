package com.examplepadroes.demopaddroes;

import com.examplepadroes.demopaddroes.Factory.Factortyserver2;
import com.examplepadroes.demopaddroes.Factory.Factory;
import com.examplepadroes.demopaddroes.Factory.Factoryserver;

public class VeiculoFactory {

    public static Factory criarVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("carro")) {
            return new  Factoryserver();
        } else if (tipo.equalsIgnoreCase("moto")) {
            return new Factortyserver2();
        }
        throw new IllegalArgumentException("Tipo de veículo desconhecido");
    }
    
}
