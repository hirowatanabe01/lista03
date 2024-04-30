package br.edu.up.Exercicios;

import br.edu.up.Prompt;
import br.edu.up.Modelos.Aluno;

public class L03E08 {
    public void executar(){
        Aluno a = new Aluno(null, 0, 0, 0);
        a.setNome(Prompt.lerLinha("Digite o nome do aluno: "));
        a.setNota01(Prompt.lerDecimal("Digite a primeira nota: "));
        a.setNota02(Prompt.lerDecimal("Digite a segunda nota: "));
        a.setNota03(Prompt.lerDecimal("Digite a terceira nota: "));
        
        double media = (a.getNota01() + a.getNota02() + a.getNota03()) / 3;
        String nomeAluno = a.getNome();
        String status;

        if (media >= 7 ) {
            status = "Aprovado";
        } else if (media <= 5) {
            status = "Reprovado";
        } else {
            status = "Recuperacao";
        }

        Prompt.imprimir("O nome do aluno e: " + nomeAluno + " e o status e: " + status + ".");
    }
}
