package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E19 {
    public void executar(){
        int lado1 = Prompt.lerInteiro("Digite o primeiro lado do triangulo: ");
        int lado2 = Prompt.lerInteiro("Digite o primeiro lado do triangulo: ");
        int lado3 = Prompt.lerInteiro("Digite o primeiro lado do triangulo: ");

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                Prompt.imprimir("O triangulo e equilatero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                Prompt.imprimir("O triangulo e isoscele.");
            } else {
                Prompt.imprimir("O triangulo e escaleno.");
            }
        } else {
            Prompt.imprimir("Os tamanhos de pelo menos um dos lado nao permite formar um triangulo.");
        }
    }
}
