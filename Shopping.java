/*
Crie uma classe chamada Shopping. Um Shopping possui os atributos nome
(do tipo String), endereco (do tipo Endereco) e lojas (que deve ser um
array de Loja). No construtor de Shopping, receba informações para
inicializar o nome, o endereço e, também, receba a quantidade máxima de lojas
deste shopping (do tipo inteiro). No construtor de shopping, então, instancie o
array lojas, informando a capacidade dele de acordo com o valor recebido por
parâmetro. Naturalmente, quando um Shopping for criado, ele não terá lojas
ainda, apenas o espaço em memória necessário para armazená-las. Crie os
métodos de acesso dos atributos. 
Implemente o método toString nesta classe, retornando uma String formatada da forma que você desejar, desde
que contenha as informações de todos os atributos da classe.
• Na classe Shopping, crie os seguintes métodos:
o insereLoja: este método recebe um objeto do tipo Loja por
parâmetro e insere esta loja no array lojas, na primeira posição livre do
array (ou seja, a primeira posição nula). O método retorna verdadeiro caso
a loja seja inserida corretamente e falso caso contrário (ou seja, caso não
haja lugar no array).
o removeLoja: este método recebe uma String que representa o nome
de uma loja e remove a loja com este nome do array lojas. O método
retorna verdadeiro caso a loja seja removida e falso caso contrário (caso
não haja a loja com o nome solicitado no array).
o quantidadeLojasPorTipo: este método recebe como parâmetro
uma String que indica o tipo de loja que deve ser buscado (Cosmético,
Vestuário, Bijuteria, Alimentação ou Informática). Deve-se então retornar
a quantidade de lojas desse tipo que existem no shopping. Caso seja
recebida uma String que não corresponde a nenhuma das opções
anteriores, o método retorna –1.
o lojaSeguroMaisCaro: este método não recebe parâmetros e retorna
a loja do tipo Informatica que paga o maior valor de seguro de
eletrônicos do shopping. Caso não haja lojas deste tipo, o método retorna
null */

public class Shopping {
    protected String nome;
    protected Endereco endereco;
    protected Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }

    public String getNome(){
        return nome;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public Loja[] getLojas(){
        return lojas;
    }

    public boolean insereLoja(Loja novaLoja){
        for(int i = 0; i < lojas.length; i++)
            if (lojas[i] == null){
                lojas[i] = novaLoja;
                return true;
            }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++)
            if (lojas[i].getNome() == nomeLoja){
                lojas[i] = null;
                return true;
            }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int contador = 0;
        tipoLoja = tipoLoja.toLowerCase();
        for(int i = 0; i < lojas.length; i++)
            if(lojas[i] != null){
                
                switch(tipoLoja){
                    case "alimentacao":
                        if (lojas[i] instanceof Alimentacao) contador++;
                        break;
                    case "bijuteria":
                        if (lojas[i] instanceof Bijuteria) contador++;
                        break;
                    case "cosmetico":
                        if (lojas[i] instanceof Cosmetico) contador++;
                        break;
                    case "informatica":
                        if (lojas[i] instanceof Informatica) contador++;
                        break;
                    case "vestuario":
                        if (lojas[i] instanceof Vestuario) contador++;
                        break;
                    default:
                        return -1;
                }
            }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro(){
        double maisCaro = 0;
        for(int i = 0; i < lojas.length; i++)
            if(lojas[i] != null && lojas[i] instanceof Informatica){
                Informatica info = (Informatica) lojas[i];
                if (info.getSeguroEletronicos() > maisCaro){
                    maisCaro = info.getSeguroEletronicos();
                    return info;
                }
            }
        //retorna null caso não haja loja2
        return null;
    }

    public String toString(){
        return String.format("SHOPPING %s" + getNome() + "\n\n" +
                            "Localizado em %s" + getEndereco() + "\n\n" +
                            "Lojas disponíveis:\n%s" +getLojas());
    }
}
