package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E17 {
    public void executar(){
        double totalAumento = 0.0;
        double salarioMinimo = 1100;

        for (int i = 0; i < 10; i++) {
            String nome = Prompt.lerLinha("Digite o nome do funcionario: ");

            double salario = Prompt.lerDecimal("Digite o salario do funcionario: ");

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

            double novoSalario = salario + reajuste;
            totalAumento += reajuste;

            Prompt.imprimir("O valor do reajuste e para o funcionario" + nome + " e: " + reajuste + " reais.");
            Prompt.imprimir("O valor do salario mais o reajuste e: " + novoSalario + " reais.");
        }

        Prompt.imprimir("A folha de pagamento vai aumentar em: " + totalAumento + " reais.");
    }
}
