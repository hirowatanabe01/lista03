package br.edu.up.Exercicios;

import br.edu.up.Prompt;
import br.edu.up.Modelos.Produto;

public class L03E06 {
    public void executar(){
        Produto p = new Produto(0, 0, 0);
        p.setPrecodeCusto(Prompt.lerDecimal("Digite o preco de custo do produto em reais: "));
        p.setLucroProduto(Prompt.lerDecimal("Digite a porcentagem do lucro (ex. 0.67 = 67%): "));

        Prompt.imprimir("O valor de venda do produto e: " + ((p.getPrecodeCusto() * p.getLucroProduto()) + p.getPrecodeCusto()) + " reais.");
    }
}
