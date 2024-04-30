package br.edu.up.Modelos;
import br.edu.up.Prompt;

public class Carro {
    private double distanciaTotal;
    private double combustivelGasto;
    private double custoFabrica;
    private double taxaImpostos;
    private double taxaDistribuidor;
    private int ano;
    private double valor;

    public Carro(int ano, double valor){
        this.ano = ano;
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            Prompt.imprimir("O ano deve ser igual ou superior a 1886.");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            Prompt.imprimir("O valor deve ser mairo que zero.");
        }
    }

    public Carro(double distanciaTotal, double combustivelGasto){
        this.distanciaTotal = distanciaTotal;
        this.combustivelGasto = combustivelGasto;
    }

    public Carro(double custoFabrica, double taxaImpostos, double taxaDistribuidor){
        this.custoFabrica = custoFabrica;
        this.taxaImpostos = 0.45;
        this.taxaDistribuidor = 0.28;
    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        if (custoFabrica > 0) {
            this.custoFabrica = custoFabrica;            
        } else {
            Prompt.imprimir("O custo de fabrica deve ser maior que zero.");
        }
    }

    public double getTaxaImpostos() {
        return taxaImpostos;
    }

    /* public void setTaxaImpostos(double taxaImpostos) {
        this.taxaImpostos = taxaImpostos;
    } */

    public double getTaxaDistribuidor() {
        return taxaDistribuidor;
    }

    /* public void setTaxaDistribuidor(double taxaDistribuidor) {
        this.taxaDistribuidor = taxaDistribuidor;
    } */

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        if (distanciaTotal > 0) {
            this.distanciaTotal = distanciaTotal;            
        } else {
            Prompt.imprimir("A distancia total deve ser superior a zero.");
        }
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        if (combustivelGasto > 0) {
            this.combustivelGasto = combustivelGasto;            
        } else {
            Prompt.imprimir("O combustivel gasto deve ser superior a zero.");
        }
    }
}
