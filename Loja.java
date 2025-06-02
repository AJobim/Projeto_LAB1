public class Loja {
    protected String nome;
    protected int quantidadeFuncionarios;
    protected double salarioBaseFuncionario;
    protected Endereco endereco;
    protected Data dataFundacao;

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


    // Métodos setter e getters
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
    
    //Saida formatada
    public String toString(){
        return String.format("Nome da loja: %s;\nFuncionarios: %s;\nSalario base: %s;\n\nEndereço:\n%s\n\nData de fundação: %s", getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), endereco.toString(), dataFundacao.toString());
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
}
