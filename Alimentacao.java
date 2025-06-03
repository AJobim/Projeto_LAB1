/*Crie uma classe chamada Alimentacao, que é um tipo de loja, representando
uma loja de alimentação. As lojas de alimentação possuem como atributo (além
de tudo que uma Loja tem) um valor do tipo Data chamado dataAlvara,
que indica a data que a loja de alimentação recebeu o alvará de funcionamento.
Crie um construtor para a classe, que receba informações para inicializar todos
os atributos. Além disso, crie os métodos de acesso dos atributos (os métodos
que ainda não existem) e sobrescreva o método toString, incluindo a
informação específica da classe */

public class Alimentacao extends Loja {
    Data dataAlvara;
    
    //Construtor etapa 3
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    //Construtor etapa 4
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int estoqueProdutosMax){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutosMax);
        this.dataAlvara = dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return dataAlvara;
    }

    public String toString(){
        return String.format(
                        "LOJA DE ALIMENTAÇÃO\n\n" +
                        "Nome da loja: %s;\nFuncionarios: %s;\nSalario base: %s;\n\n" +
                        "Endereço:\n%s" + "\n\nData de fundação: %s\n\nData do alvará:", 
                        getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), 
                        endereco.toString(), dataFundacao.toString(), getDataAlvara()
                        );
    }
}

