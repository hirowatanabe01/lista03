package br.edu.up.Modelos;

import br.edu.up.Prompt;

public class Pessoa {
    private int idade;
    private int saude;
    private double altura;
    private String nome;
    private String sexo;
    private String riscoSeguro;

    public Pessoa(int idade){
        this.idade = idade;
    }

    public Pessoa(String nome, String sexo, int idade, int saude){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 110) {
            this.idade = idade;
        } else {
            Prompt.imprimir("A didade deve ser entre zero e cento e dez anos.");
        }
    }
}
