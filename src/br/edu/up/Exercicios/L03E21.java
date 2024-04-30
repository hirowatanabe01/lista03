package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E21 {
    public void executar(){
        int idade = Prompt.lerInteiro("Digite a idade do nadador: ");

        if (idade >= 5 && idade <= 7) {
            Prompt.imprimir("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            Prompt.imprimir("Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            Prompt.imprimir("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            Prompt.imprimir("Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Senior");
        } else {
            Prompt.imprimir("Idade fora da faixa etaria");
        }
    }
}
