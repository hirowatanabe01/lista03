package br.edu.up.Modelos;
import br.edu.up.Prompt;

public class Cambio {
    private double cotacaoDolar;
    private double quantidadeDolares;

    public Cambio(double cotacaoDolar, double quantidadeDolares){
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolares = quantidadeDolares;
    }

    public double getcotacaoDolar() {
        return cotacaoDolar;
    }

    public void setcotacaoDolar(double cotacaoDolar) {
        if (cotacaoDolar >  0) {
            this.cotacaoDolar = cotacaoDolar;            
        } else {
            Prompt.imprimir("A cotacao do Dolar deve ser maior que zero.");
        }
    }

    public double getQuantidadeDolares() {
        return quantidadeDolares;
    }

    public void setQuantidadeDolares(double quantidadeDolares) {
        if (quantidadeDolares > 0) {
            this.quantidadeDolares = quantidadeDolares;            
        } else {
            Prompt.imprimir("A quantidade de Dolares deve ser maior que zero.");
        }
    }
}
