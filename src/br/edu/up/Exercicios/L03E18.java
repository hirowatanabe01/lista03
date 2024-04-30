package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E18 {
    public void executar(){

        String nome = Prompt.lerLinha("Digite o nome do funcionario: ");

        int idade = Prompt.lerInteiro("Digite a idade do funcionario: ");

        int sexo = Prompt.lerInteiro("Digite o sexo do funcionario, 0 para Homem ou 1 para Mulher: ");

        double salario = Prompt.lerDecimal("Digite o salario do funcionario: ");

        double abono = 0;
        
        if (sexo >= 0 || sexo <= 1) {
            if (sexo == 0) {
                if (idade >= 30) {
                    abono = 100;
                } else {
                    abono = 50;
                }
            } else {
                if (idade >= 30) {
                    abono = 200;
                } else {
                    abono = 80;
                }
            }
        } else {
            Prompt.imprimir("O valor digitado para o sexo e invalido!");            
        }

        double salarioComAbono = salario + abono;

        Prompt.imprimir("O funcionario " + nome + " e " + sexo + " e o salario com abono e: " + salarioComAbono + " reais.");

    }
}
