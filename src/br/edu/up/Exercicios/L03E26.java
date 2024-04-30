package br.edu.up.Exercicios;

import br.edu.up.Prompt;

public class L03E26 {
    public void executar(){

        String nome = Prompt.lerLinha("Digite o nome: ");

        int idade = Prompt.lerInteiro("Digite a idade: ");

        int grupoRisco = Prompt.lerInteiro("Digite o grupo de risco (1 para baixo, 2 para médio, 3 para alto):");

        //int categoria = 0;

        if (idade >= 17 && idade <= 70) {
            if (idade >= 17 && idade <= 20){
                switch (grupoRisco) {
                    case 1:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 1");
                        break;

                    case 2:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 2");
                        break;

                    case 3:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 3");
                        break;

                    default:
                        Prompt.imprimir("Escolha um grupo de risco valido!");
                        break;
                }
            } else if (idade >= 21 && idade <= 24) {
                switch (grupoRisco) {
                    case 1:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 2");
                        break;

                    case 2:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 3");
                        break;

                    case 3:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 4");
                        break;

                    default:
                        Prompt.imprimir("Escolha um grupo de risco valido!");
                        break;
                }
            } else if (idade >= 25 && idade <= 34) {
                switch (grupoRisco) {
                    case 1:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 3");
                        break;

                    case 2:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 4");
                        break;

                    case 3:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 5");
                        break;

                    default:
                        Prompt.imprimir("Escolha um grupo de risco valido!");
                        break;
                }
            } else if (idade >= 35 && idade <= 64) {
                switch (grupoRisco) {
                    case 1:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 4");
                        break;

                    case 2:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 5");
                        break;

                    case 3:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 6");
                        break;

                    default:
                        Prompt.imprimir("Escolha um grupo de risco valido!");
                        break;
                }
            } else if (idade >= 65 && idade <= 70) {
                switch (grupoRisco) {
                    case 1:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 7");
                        break;

                    case 2:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 8");
                        break;

                    case 3:
                        Prompt.imprimir("O nome e: " + nome + "." + " A idade e: " + idade + "." + " O grupo de risco e:" + grupoRisco + "." + " A categoria e: 9");
                        break;

                    default:
                        Prompt.imprimir("Escolha um grupo de risco valido!");
                        break;
                }
            }
        } else {
            Prompt.imprimir(nome + " nao se enquadra em nenhuma das categorias ofertadas.");
        }
    }
}