/*• Crie uma classe chamada Bijuteria, que é um tipo de loja, representando
uma loja de bijuteria. As lojas de bijuteria possuem como atributo (além de tudo
que uma Loja tem) um double chamado metaVendas, que representa a
meta de vendas mensais desta loja. Crie um construtor para a classe, que receba
informações para inicializar todos os atributos. Além disso, crie os métodos de
acesso dos atributos (os métodos que ainda não existem) e sobrescreva o
método toString, incluindo a informação específica da classe. */

public class Bijuteria extends Loja {
    double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas(){
        return metaVendas;
    }

    public String toString(){
        return String.format(
                        "LOJA DE BIJUTERIAS\\n" +
                        "\n Nome da loja: %s;\nFuncionarios: %s;\nSalario base: %s;\n\n" +
                        "Endereço:\n%s" + "\n\nData de fundação: %s\n\nMeta de vendas", 
                        getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), 
                        endereco.toString(), dataFundacao.toString(), getMetaVendas()
                        );
    }
}
