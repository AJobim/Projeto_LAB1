public class Loja {
    protected String nome;
    protected int quantidadeFuncionarios;
    protected double salarioBaseFuncionario;
    protected Endereco endereco;
    protected Data dataFundacao;
    protected Produto[] estoqueProdutos;

     //Construtores da etapa 1
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = null;
        this.dataFundacao = null;
    }
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = null;
        this.dataFundacao = null;
    }

    //Construtores da etapa 2, com endereco e dataFundacao
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao; 
    }

    //Construtores da etapa 4, com estoqueProdutos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int estoqueProdutosMax){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[estoqueProdutosMax];
    }
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int estoqueProdutosMax){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[estoqueProdutosMax];
    }


    // Métodos setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

    // Métodos getter
    public String getNome(){
        return nome;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public Data getDataFundacao(){
        return dataFundacao;
    }
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public double gastosComSalario(){
        if (this.salarioBaseFuncionario != -1){
            return (salarioBaseFuncionario * quantidadeFuncionarios);
        } else return -1;   
    }

    public char tamanhoDaLoja(){
        int qtd = this.quantidadeFuncionarios;
        if (qtd < 10){
            return 'P';
        } else if (qtd >= 10 && qtd <= 30){
            return 'M';
        } else if (qtd >= 31) return 'G';
        else return 0;
    }

    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++)
            if(estoqueProdutos[i] != null){
                System.out.println(estoqueProdutos[i]);
            }
    }

    public boolean insereProduto(Produto novoProduto){
        for (int i =0; i < this.estoqueProdutos.length; i++)
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = novoProduto;
                return true;
            }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        for (int i = 0; i < estoqueProdutos.length; i++)
            if (estoqueProdutos != null){
                if (estoqueProdutos[i].getNome() == nomeProduto){
                    estoqueProdutos[i] = null;
                    return true;
                }
            }
        return false;
    }

    //Saida formatada
    public String toString(){
        return String.format("Nome da loja: %s;\nFuncionarios: %s;\nSalario base: %s;\n\n" +
                            "Endereço:\n%s\n\nData de fundação: %s\n\nProdutos em estoque: %s",
                            getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), 
                            endereco.toString(), dataFundacao.toString(), (estoqueProdutos!=null ? estoqueProdutos.toString() : 0));
    }
}
