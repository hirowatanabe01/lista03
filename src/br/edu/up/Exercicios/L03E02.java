package br.edu.up.Exercicios;
import br.edu.up.Prompt;
import br.edu.up.Modelos.Carro;

public class L03E02 {
    public void executar() {
        Carro c = new Carro(0, 0);
        c.setDistanciaTotal(Prompt.lerDecimal("Digite a distancia total percorrida em Km: "));
        c.setCombustivelGasto(Prompt.lerDecimal("Digite o combustivel gasto em Litros: "));

        Prompt.imprimir("O consumo medio do automovel foi: " + (c.getCombustivelGasto() / c.getDistanciaTotal()) + "L/Km.");
    }
}
