/*Crie uma classe chamada Informatica, que é um tipo de loja, representando
uma loja de informática. As lojas de informática possuem como atributos (além
de tudo que uma Loja tem) um valor do tipo double chamado
seguroEletronicos, que representa um seguro que lojas que vendem
aparelhos eletrônicos devem pagar mensalmente. Crie um construtor para a
classe, que receba informações para inicializar todos os atributos. Além disso, crie
os métodos de acesso dos atributos (os métodos que ainda não existem) e
sobrescreva o método toString, incluindo a informação específica da classe. */

public class Informatica extends Loja {
    double seguroEletronicos;

    //Etapa 3
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    //Etapa 4
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int estoqueProdutosMax){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutosMax);
        this.seguroEletronicos = seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    public String toString(){
        return String.format(
                        "LOJA DE INFORMATICA\n\n" +
                        "Nome da loja: %s;\nFuncionarios: %s;\nSalario base: %s;\n\n" +
                        "Endereço:\n%s" + "\n\nData de fundação: %s\nPreço para o seguro do eletrônico: R$%s", 
                        getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), 
                        endereco.toString(), dataFundacao.toString(), getSeguroEletronicos()
                        );
    }
}
