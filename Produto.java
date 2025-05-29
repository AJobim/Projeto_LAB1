package Projeto_LAB;

public class Produto {
    private String nome;
    private double preco;
    private Data validade;

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
    
    public boolean estaVencido(int ano, int mes, int dia){
    
        if (validade.getAno() > ano){
            if (validade.getMes() > mes){
                if (validade.getDia() > dia){
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
}
