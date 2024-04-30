package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E16 {
    public void executar(){
       
        double salarioMinimo = 1100;
        double[] salarios = new double[10];

        for(int i=0; i<10; i++){
            salarios[i] = Prompt.lerDecimal("Digite o salario do proximo funcionario: ");
        }

        for (int i = 0; i < 10; i++) {
            double salario = salarios[i];
            double reajuste;

            if (salario < 3 * salarioMinimo) {
                reajuste = salario * 0.50;
            } else if (salario <= 10 * salarioMinimo) {
                reajuste = salario * 0.20;
            } else if (salario <= 20 * salarioMinimo) {
                reajuste = salario * 0.15;
            } else {
                reajuste = salario * 0.10;
            }

            salarios[i] += reajuste;
            Prompt.imprimir("O salario com o reajuste e: " + salarios[i]);
        }
        
    }
}
