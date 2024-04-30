package br.edu.up.Exercicios;

import br.edu.up.Prompt;
import br.edu.up.Modelos.Pessoa;

public class L03E13 {
    public void executar(){
        
        int qPessoas = Prompt.lerInteiro("Por favor, insira a quantidade de pessoas: ");
        int totalApto = 0;
        int totalInapto = 0;
        
        for (int i = 0; i < qPessoas; i++) {
            Pessoa p = new Pessoa(null, null, 0, 0);

            String nome = Prompt.lerLinha("Digite o nome da pessoa " + qPessoas + ":");
            int idade = Prompt.lerInteiro("Digite a idade da pessoa "  + qPessoas + ":");
            String sexo = Prompt.lerLinha("Digite o sexo da pessoa " + qPessoas + ", " + "'M' para masculino ou 'F' para feminino: ");
            int saude = Prompt.lerInteiro("Informe se a pessoa " + qPessoas + " esta doente (digite 0) ou saudavel (digite 1): ");

            p.setNome(nome);
            p.setIdade(idade);
            p.setSexo(sexo);
            p.setSaude(saude);
            

            if (idade >= 18) {
                if (sexo.equalsIgnoreCase("M")) {
                    if (saude == 1) {
                        Prompt.imprimir(">>>" + p.getNome() + " e homem, esta saudavel e, portanto apto ao servico militar obrigatorio!");
                        totalApto++;
                    } else if (saude == 0) {
                        Prompt.imprimir(">>>" + p.getNome() + " nao esta apto a servir por motivo de doenca.");
                        totalInapto++;
                    } else {
                        Prompt.imprimir(">>> Valores validos sao apenas 0 ou 1!");;
                    }                    
                } else {
                    Prompt.imprimir(">>>" + p.getNome() + " e mulher e esta dispensada do servico militar obrigatorio.");
                    totalInapto++;
                }
            } else {
                Prompt.imprimir(">>>" + p.getNome() + " tem menos de 18 anos e, portanto, e menor de idade.");
                totalInapto++;
            }
        }

        Prompt.imprimir(">>> O total de pessoas que estao aptas ao servico militar obrigatorio e: " + totalApto + ". E o total de pessoas que nao estao aptas e: " + totalInapto + ".");
    }
}
