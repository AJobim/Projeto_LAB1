public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereco;
    private Data data;

     //Construtores da etapa 1
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = null;
        this.data = null;
    }
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = null;
        this.data = null;
    }


    //Construtores da etapa 2, com endereco e data
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data data){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.data = data;
    }
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data data){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.data = data; 
    }


    // Métodos setter e getters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public void setSalarioBaseFuncionario(int salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setData(Data data){
        this.data = data;
    }

    public String getNome(){
        return nome;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public int getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public Data getData(){
        return data;
    }
    
    //Saida formatada
    public String toString(){
        return String.format("Nome da empresa: %s;\nFuncionarios: %s;\nSalario base: %s", getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario());
    }

    public int gastosComSalario(){
        if (this.salarioBaseFuncionario != -1){
            return salarioBaseFuncionario * quantidadeFuncionarios;
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
