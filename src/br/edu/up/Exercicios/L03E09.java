package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E09 {
    public void executar(){
        int count = 0;

        Prompt.imprimir("Digite dez (10) numeros inteiros: ");

        for (int i = 0; i < 10; i++) {
            int num = Prompt.lerInteiro("Numero " + (i+1) + ": ");

            if (num >= 10 && num <= 150) {
                count++;
            }
        }

        Prompt.imprimir("O numero de valores entre 10 e 150 (inclusive) e: " + count);
    }
}
