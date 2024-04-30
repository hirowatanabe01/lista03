package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E10 {
    public void executar(){
        int qPessoas = Prompt.lerInteiro("Por favor, insira a quantidade de pessoas: ");

        for (int i = 0; i < qPessoas; i++) {
            int idade = Prompt.lerInteiro("Insira a idade da pessoa " + (i+1) + ": ");

            if (idade >= 18) {
                Prompt.imprimir("Pessoa " + (i+1) + " e maior de idade.");
            } else {
                Prompt.imprimir("Pessoa " + (i+1) + " e menor de idade.");
            }
        }
    }
}
