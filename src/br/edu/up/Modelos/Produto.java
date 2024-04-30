package br.edu.up.Modelos;
import br.edu.up.Prompt;

public class Produto {
    private double valorCompra;
    private double precodeCusto;
    private double lucroProduto;

    public Produto(double valorCompra, double precodeCusto, double lucroProduto){
        this.valorCompra = valorCompra;
        this.precodeCusto = precodeCusto;
        this.lucroProduto = lucroProduto;
    }

    public double getLucroProduto() {
        return lucroProduto;
    }

    public void setLucroProduto(double lucroProduto) {
        if (lucroProduto > 0) {
            this.lucroProduto = lucroProduto;            
        } else {
            Prompt.imprimir("A procentagem de lucro deve ser maior que zero.");
        }
    }

    public double getPrecodeCusto() {
        return precodeCusto;
    }

    public void setPrecodeCusto(double precodeCusto) {
        if (precodeCusto > 0) {
            this.precodeCusto = precodeCusto;
        } else {
            Prompt.imprimir("O preco de custo deve ser maior que zero.");
        }
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        if (valorCompra > 0) {
            this.valorCompra = valorCompra;            
        } else {
            Prompt.imprimir("O valor da compra deve ser maior que zero.");
        }
    }
}
