package com.examplepadroes.demopaddroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examplepadroes.demopaddroes.Factory.Factory;
import com.examplepadroes.demopaddroes.Factory.Factoryserver;

@SpringBootApplication
public class DemopaddroesApplication {

	public static void main(String[] args) {

		Factory carro = VeiculoFactory.criarVeiculo("carro");
		carro.exibittipo();
   

        
		Factory moto = VeiculoFactory.criarVeiculo("moto");
        moto.exibittipo();
		SpringApplication.run(DemopaddroesApplication.class, args);
	}

}
