package br.edu.up.Modelos;
import br.edu.up.Prompt;

public class Vendedor {
    private String nome;
    private double salarioFixo;
    private double totalVendas;
    private double comissao;

    public Vendedor(String nome, double salarioFixo, double totalVendas, double comissao){
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
        this.comissao = 0.15;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        if (salarioFixo > 0) {
            this.salarioFixo = salarioFixo;            
        } else {
            Prompt.imprimir("O valor do salario deve ser maior que zero.");
        }
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        if (totalVendas >= 1) {
            this.totalVendas = totalVendas;            
        } else {
            Prompt.imprimir("O total de vendas deve ser um valor maior ou igual a zero e inteiro.");
        }
    }

    public double getComissao() {
        return comissao;
    }

    /* public void setComissao(double comissao) {
        this.comissao = comissao;
    } */
}
