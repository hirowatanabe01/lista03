package br.edu.up.Exercicios;

import br.edu.up.Prompt;
import br.edu.up.Modelos.Carro;

public class L03E12 {
    public void executar(){
        int totalCarros2k = 0;
        int totalCarros = 0;

        while (true) {
            int ano = Prompt.lerInteiro("Digite o ano do carro: ");
            double valor = Prompt.lerDecimal("Digite o valor do carro: ");
            double desc;

            Carro c = new Carro(ano, valor);
            c.setAno(ano);
            c.setValor(valor);

            if (c.getAno() <= 2000) {
                desc = c.getValor() * 0.12;
                totalCarros2k++;
            } else {
                desc = c.getValor() * 0.07;
            }

            double valorDesc = c.getValor() - desc;
            Prompt.imprimir("O valor do desc e: " + desc);
            Prompt.imprimir("O valor a ser pago pelo cliente e: " + valorDesc);

            totalCarros++;

            String resposta = Prompt.lerLinha("Deseja continuar calculando? (S)im ou (N)ao.");
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }

        Prompt.imprimir("Total de carros ate ano 2000: " + totalCarros2k);
        Prompt.imprimir("Total de carros: " + totalCarros);
    }
}
