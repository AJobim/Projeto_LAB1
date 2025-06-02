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

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    public String toString(){
        return String.format("Nome da loja: %s;\nLoja de Vestuários. %s produtos importados.\n\nFuncionarios: %s;\nSalario base: %s;\n\nEndereço:\n%s\n\nData de fundação: %s", getNome(), getProdutosImportados() ? "Vende" : "Não vende", getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), endereco.toString(), dataFundacao.toString());
    }
}
