public class Vestuario extends Loja {
    boolean produtosImportados;

    //Etapa 3
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    //Etapa 4
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int estoqueProdutosMax){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutosMax);
        this.produtosImportados = produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    public String toString(){
        return String.format(
                        "LOJA DE VESTUARIOS\\n" +
                        "\n Nome da loja: %s;\nFuncionarios: %s;\nSalario base: %s;\n\n" +
                        "Endereço:\n%s" + "\n\nData de fundação: %s\n\n%s produtos importados", 
                        getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), 
                        endereco.toString(), dataFundacao.toString(), getProdutosImportados() ? "Vende" : "Não vende"
                        );
    }
}
