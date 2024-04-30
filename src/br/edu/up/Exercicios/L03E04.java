package br.edu.up.Exercicios;
import br.edu.up.Prompt;
import br.edu.up.Modelos.Cambio;

public class L03E04 {
    public void executar() {
        Cambio c = new Cambio(0, 0);
        c.setcotacaoDolar(Prompt.lerDecimal("Digite a cotacao do Dolar atual: "));
        c.setQuantidadeDolares(Prompt.lerDecimal("Digite a quantidade de Dolares: "));

        Prompt.imprimir("O valor em Real e: " + (c.getQuantidadeDolares() * c.getcotacaoDolar()) + " reais.");
    }
}
