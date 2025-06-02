public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    //construtor da etapa 1
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = null;
    }

    //construtor da etapa 2
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //getters
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public Data getDataValidade(){
        return dataValidade;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    public String toString(){
        return String.format("-> %s - %s | Data de validade: %s", getNome(), getPreco(), dataValidade.toString());
    }
    
    //Verifica se o produto venceu
    public boolean estaVencido(Data dataAtual){
        if (dataValidade.getAno() < dataAtual.getAno()){
            return true;
        }
        else if (dataValidade.getAno() == dataAtual.getAno()){
            if (dataValidade.getMes() < dataAtual.getMes()){
                    return true;
            }
            else if (dataValidade.getMes() == dataAtual.getMes()){
                if (dataValidade.getDia() < dataAtual.getDia()){
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
}
