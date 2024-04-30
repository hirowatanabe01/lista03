package br.edu.up.Exercicios;

import br.edu.up.Prompt;
import br.edu.up.Modelos.Aluno;

public class L03E25 {
    public void executar(){
        String nome = Prompt.lerLinha("Digite o nome do estudante: ");
        double nota01 = Prompt.lerDecimal("Digite a nota do  trabalho de laboratorio do estudante: ");
        double nota02 = Prompt.lerDecimal("Digite a nota da avaliacao semestral do estudante: ");
        double nota03 = Prompt.lerDecimal("Digite a nota do exame final do estudante: ");

        Aluno a = new Aluno(null, 0, 0, 0);
        a.setNome(nome);
        a.setNota01(nota01);
        a.setNota02(nota02);
        a.setNota03(nota03);

        double peso1 = 2.0;
        double peso2 = 3.0;
        double peso3 = 5.0;

        double notaFinal = (nota01 * peso1 + nota02 * peso2 + nota03 * peso3) / (peso1 + peso2 + peso3);

        String classificacao;
        
        if (notaFinal >= 8 && notaFinal <= 10) {
            classificacao = "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            classificacao = "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            classificacao = "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            classificacao = "D";
        } else {
            classificacao = "R";
        }        

        Prompt.imprimir("Nome do estudante: " + nome + "." + "Nota final: " + notaFinal + "." + "Classificação: " + classificacao);
    }
}
