/*Crie uma classe chamada Vestuario, que é um tipo de loja, representando
uma loja de vestuário. As lojas de vestuários possuem como atributo (além de
tudo que uma Loja tem) um valor booleano chamado
produtosImportados. Este atributo indica se a loja de vestuário vende
roupas importadas ou não. Crie um construtor para a classe, que receba
informações para inicializar todos os atributos. Além disso, crie os métodos de
acesso dos atributos (os métodos que ainda não existem) e sobrescreva o
método toString, incluindo a informação específica da classe. */

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
