package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E15 {
    public void executar(){
        double totalDesconto = 0;
        double totalPagoClientes = 0;
        
        while (true) {
            double precoCarro = Prompt.lerDecimal("Digite o preco do carro em Reais ou digite 0 para sair do programa: ");
    
            if (precoCarro <= 0) {
                Prompt.imprimir("O preco do carro dever ser maior que zero!");
                break;
            }
    
            int combustivel =  Prompt.lerInteiro("Digite o tipo de combustivel, 0 para gasolina, 1 para alcool ou 2 para diesel: ");
            double desconto = 0;
    
            switch (combustivel) {
                case 0:
                    desconto = precoCarro * 0.21;
                    break;
                case 1:
                    desconto = precoCarro * 0.25;
                    break;
                case 2:
                    desconto = precoCarro * 0.14;
                    break;        
                default:
                    Prompt.imprimir("A opcao digitada para o tipo de combustivel nao existe!");
                    break;
            }

            double precoComDesconto = precoCarro - desconto;
            totalDesconto += desconto;
            totalPagoClientes += precoComDesconto;

            Prompt.imprimir("O valor do desconto e: " + desconto + " reais.");
            Prompt.imprimir("O valor pago pelo cliente e: " + precoComDesconto + " reais.");
        }

        Prompt.imprimir("O total de desconto dado e: " + totalDesconto + " reais.");
        Prompt.imprimir("O total pago pelos clientes e: " + totalPagoClientes + " reais.");
    }
}
