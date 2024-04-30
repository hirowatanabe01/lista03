package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E14 {
    public void executar(){
        //40 produtos
        double precoCusto = 0;
        double precoVenda = 0;
        double totalCusto = 0;
        double totalVenda = 0;

        for(int i = 0; i < 10; i++){
            precoCusto = Prompt.lerDecimal("Digite o preco de CUSTO do produto: ");
            precoVenda = Prompt.lerDecimal("Digite o preco de VENDA do produto: ");

            if (precoCusto < precoVenda) {
                Prompt.imprimir(">>> Houve LUCRO!");
            } else if (precoVenda > precoCusto) {
                Prompt.imprimir(">>> Houve PREJUIZO!");
            } else {
                Prompt.imprimir(">>> Houve EMPATE entre o preco de custo e o preco de venda!");
            }

            totalCusto += precoCusto;
            totalVenda += precoVenda;
        }

        Prompt.imprimir("A media do preco de CUSTO e: " + (totalCusto / 10) + ". E a media do preco de VENDA e: " + (totalVenda / 10) + ".");
    }
}
