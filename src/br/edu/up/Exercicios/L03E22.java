package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E22 {
    public void executar(){
        int tipoCliente = Prompt.lerInteiro("Escolha o tipo de cliente. Digite 1 - Residencia, 2 - Comercio, 3 - Industria): ");
        
        double consumo = Prompt.lerDecimal("Digite a quantidade de KW/h consumidos: ");
        
        double valorKWh = 0;
        
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                Prompt.imprimir("Tipo de cliente escolhido invalido!");
                return;
        }
        
        double valorConta = consumo * valorKWh;
        Prompt.imprimir("O valor da conta de luz e: " + valorConta + " reais.");
    }
}
