package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E23 {
    public void executar(){
        String nome = Prompt.lerLinha("Digite o seu nome:");
        
        int sexo = Prompt.lerInteiro("Digite o seu sexo, 0 para homem ou 1 para mulher:");
        
        double altura = Prompt.lerDecimal("Digite a sua altura em metros:");
        
        int idade = Prompt.lerInteiro("Digite a sua idade:");
        
        double pesoIdeal = 0;
        
        if (sexo == 0) {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade >= 40) {
                    pesoIdeal = (72.7 * altura) - 45;
                } else {
                    pesoIdeal = (72.7 * altura) - 53;
                }
            } else {
                if (altura <= 1.70) {
                    if (idade <= 40) {
                        pesoIdeal = (72.7 * altura) - 50;
                    } else {
                        pesoIdeal = (72.7 * altura) - 58;
                    }
                }
            }
        } else if (sexo == 1) {
            if (altura <= 1.50) {
                if (idade < 35) {
                    pesoIdeal = (62.1 * altura) - 49;
                } else {
                    pesoIdeal = (62.1 * altura) - 45;
                }
            } else {
                pesoIdeal = (62.1 * altura) - 44.7;
            }
        } else {
            Prompt.imprimir("O numero escolhido para o sexo e invalido!");
        }

        Prompt.imprimir("O peso ideal de " + nome + " e: " + pesoIdeal + " kilos.");
    }
}
