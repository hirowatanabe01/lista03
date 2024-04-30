package br.edu.up.Exercicios;
import br.edu.up.Prompt;
import br.edu.up.Modelos.Produto;

public class L03E05 {
    public void executar(){
        Produto p = new Produto(0, 0, 0);
        p.setValorCompra(Prompt.lerDecimal("Digite o valor da compra em reais: "));

        Prompt.imprimir("O valor das prestacoes e 5 vezes de: " + (p.getValorCompra() / 5) + " reais.");
    }
}
