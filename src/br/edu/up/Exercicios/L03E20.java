package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E20 {
    public void executar(){
        int nivel = Prompt.lerInteiro("Digite o nivel do professor (1, 2 ou 3):");
        int horas = Prompt.lerInteiro("Digite o numero de horas/aula:");
            
        double valorHoraAula = 0;
        
        if (nivel == 1) {
            valorHoraAula = 12.00;
        } else if (nivel == 2) {
            valorHoraAula = 17.00;
        } else if (nivel == 3) {
            valorHoraAula = 25.00;
        } else {
            Prompt.imprimir("Nivel invalido");
        }
        
        double salario = valorHoraAula * horas;
        Prompt.imprimir("O salario do professor e: " + salario + " reais.");
    }
}

