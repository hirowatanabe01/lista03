package br.edu.up.Exercicios;
import br.edu.up.Prompt;
import br.edu.up.Modelos.Vendedor;

public class L03E03 {
    public void executar() {
        Vendedor v = new Vendedor(null, 0, 0, 0);
        v.setNome(Prompt.lerLinha("Digite o nome do vendedor: "));
        v.setSalarioFixo(Prompt.lerDecimal("Digite o valor do salario fixo do vendedor: "));
        v.setTotalVendas(Prompt.lerInteiro("Digite o valor do total de vendas em reais: "));

        Prompt.imprimir("O nome do vendedor e: " + v.getNome() + ". " + "O salario fixo e: " + v.getSalarioFixo() + ". " + "O salario no final do mes e: " + ((v.getTotalVendas() * v.getComissao()) + v.getSalarioFixo()) + ". ");
    }
}
