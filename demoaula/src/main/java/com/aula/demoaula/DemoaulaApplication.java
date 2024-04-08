package com.aula.demoaula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class DemoaulaApplication {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        String opcao = "";
    
        while (!opcao.equals("sair")) { 
            System.out.println("Digite seu salário antes do reajuste (-1 para sair): ");
            float salario = entrada.nextFloat();
            
            if (salario == -1) {
                System.out.println("Saída realizada com sucesso.");
                break; 
            }

            System.out.println("Digite a taxa de reajuste: ");
            float taxa = entrada.nextFloat();
                    
            System.out.println("Digite a taxa de inflação: ");
            float inflacao = entrada.nextFloat();
                    
            float novoSalario = salario * (1 + taxa / 100);
            float diferenca = novoSalario - salario;
            float percentual = (diferenca / salario) * 100;
            float salarioCorrigido = novoSalario - (inflacao / 100 * novoSalario);
            float aumentoReal = salarioCorrigido - salario;
                    
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("O percentual do aumento aplicado é: " + percentual + "%");
            System.out.println("O valor do aumento foi de: " + diferenca + " reais");
            System.out.println("O aumento real descontando a inflação é de: " + aumentoReal);
            System.out.println("O novo salário após a taxa foi: " + salarioCorrigido);

        }
    
        SpringApplication.run(DemoaulaApplication.class, args);
    
        entrada.close();
    }
}
