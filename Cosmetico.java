public class Cosmetico extends Loja {
    double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxa){
        taxaComercializacao = taxa;
    }

    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    public String toString(){
        return String.format(
                        "LOJA DE COSMETICOS\\n" +
                        "\n Nome da loja: %s;\nFuncionarios: %s;\nSalario base: %s;\n\n" +
                        "Endereço:\n%s" + "\n\nData de fundação: %s\n\nTaxa de comercialização: %s", 
                        getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), 
                        endereco.toString(), dataFundacao.toString(), getTaxaComercializacao()
                        );
    }
}
