package br.edu.up.Exercicios;

import br.edu.up.Prompt;
import br.edu.up.Modelos.Carro;

public class L03E07 {
    public void executar(){
        Carro c = new Carro(0, 0, 0);
        c.setCustoFabrica(Prompt.lerDecimal("Digite o custo de fabrica do carro em reais: "));
        double custoFabrica = c.getCustoFabrica();
        double taxaImpostos = c.getTaxaImpostos();
        double taxaDistribuidor = c.getTaxaDistribuidor();

        double impostos = (custoFabrica * taxaImpostos);
        double custoImpostos = (custoFabrica + impostos);
        double custoDistribuidor = (custoImpostos * taxaDistribuidor);
        double custoConsumidor = (custoImpostos + custoDistribuidor);

    Prompt.imprimir("O custo ao consumidor e: " + custoConsumidor + " reais.");
    }
}
