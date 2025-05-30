public class Produto {
    private String nome;
    private double preco;
    private Data validade;

    //construtor da etapa 1
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.validade = null;
    }

    //construtor da etapa 2
    public Produto(String nome, double preco, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    //getters
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public Data getValidade(){
        return validade;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setValidade(Data validade){
        this.validade = validade;
    }

    public String toString(){
        return String.format("-> %s - %s", getNome(), getPreco());
    }
    
    public boolean estaVencido(Data dataAtual){
        if (validade.getAno() >= dataAtual.getAno()){
            if (validade.getMes() >= dataAtual.getMes()){
                if (validade.getDia() >= dataAtual.getDia()){
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
}
