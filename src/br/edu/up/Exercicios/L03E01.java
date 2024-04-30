package br.edu.up.Exercicios;
import br.edu.up.Prompt;
import br.edu.up.Modelos.Aluno;

public class L03E01 {
    public void executar() {
        Aluno a = new Aluno(null, 0, 0, 0);
        a.setNome(Prompt.lerLinha("Digite o nome do aluno: "));
        a.setNota01(Prompt.lerDecimal("Digite a nota da primeira prova: "));
        a.setNota02(Prompt.lerDecimal("Digite a nota da segunda prova: "));
        a.setNota03(Prompt.lerDecimal("Digite a nota da terceira prova: "));
        
        Prompt.imprimir("O nome do aluno e: " + a.getNome() + " e a media aritimetica e: " + ((a.getNota01() + a.getNota02() + a.getNota03())/3));
    }
}
