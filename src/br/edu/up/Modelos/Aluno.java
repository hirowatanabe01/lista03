package br.edu.up.Modelos;
import br.edu.up.Prompt;

public class Aluno {
    private String nome;
    private double nota01;
    private double nota02;
    private double nota03;

    public Aluno(String nome, double nota01, double nota02, double nota03){
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        if (nota01 > 0 && nota01 <= 10) {
            this.nota01 = nota01;            
        } else {
            Prompt.imprimir("A nota digitada e invalida, digite um valor entre 0.0 e 10");
        }
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        if (nota02 > 0 && nota02 <= 10) {
            this.nota02 = nota02;            
        } else {
            Prompt.imprimir("A nota digitada e invalida, digite um valor entre 0.0 e 10");
        }
    }

    public double getNota03() {
        return nota03;
    }

    public void setNota03(double nota03) {
        if (nota03 > 0 && nota03 <= 10) {
            this.nota03 = nota03;            
        } else {
            Prompt.imprimir("A nota digitada e invalida, digite um valor entre 0.0 e 10");
        }
    }

    
}
