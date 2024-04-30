package br.edu.up.Exercicios;

import br.edu.up.Prompt;
import br.edu.up.Modelos.Pessoa;

public class L03E11 {
    public void executar(){
        int totalH = 0;
        int totalM = 0;
        
        for (int i = 0; i < 5; i++) {
            String nome = Prompt.lerLinha("Digite o nome: ");
            String sexo = Prompt.lerLinha("Digite 'M' para masculino ou 'F' para feminino: ");

            Pessoa p = new Pessoa(nome, sexo, i, i);
            p.setNome(nome);
            p.setSexo(sexo);

            if (sexo.equalsIgnoreCase("M")) {
                Prompt.imprimir(p.getNome() + " e homem.");
                totalH++;
            } else if (sexo.equalsIgnoreCase("F")) {
                Prompt.imprimir(p.getNome() + " e mulher.");
                totalM++;
            } else {
                System.out.println("Sexo invalido.");
                i--;
            }
        }

        Prompt.imprimir("Total de homens: " + totalH);
        Prompt.imprimir("Total de mulheres: " + totalM);
    }
}
