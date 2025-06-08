public class Shopping {
    protected String nome;
    protected Endereco endereco;
    protected Loja[] lojas;

    //Construtor
    public Shopping(String nome, Endereco endereco, int maxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    //Getters e setters
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
        for(int i = 0; i < lojas.length; i++){
            if (lojas[i] == null){
                lojas[i] = novaLoja; //Cria loja no primeiro null encontrado de um array
                return true;
            }
        }
        return false; //Se não houver nenhum caso retorna falso
    }

    public boolean removeLoja(String nomeLoja){
        if (lojas == null) return false;

        for(int i = 0; i < lojas.length; i++){
            if (lojas[i] != null){
                if (lojas[i].getNome() == nomeLoja){
                    lojas[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int contador = 0;
        tipoLoja = tipoLoja.toLowerCase(); //escreve o tipoLoja em letras minusculas pra diminuir as possibilidades

        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null){
                switch(tipoLoja){
                    case "alimentação":
                    case "alimentacao":
                        if (lojas[i] instanceof Alimentacao) contador++;
                        break;
                    case "bijuteria":
                        if (lojas[i] instanceof Bijuteria) contador++;
                        break;
                    case "cosmético":
                    case "cosmetico":
                        if (lojas[i] instanceof Cosmetico) contador++;
                        break;
                    case "informática":
                    case "informatica":
                        if (lojas[i] instanceof Informatica) contador++;
                        break;
                    case "vestuário":
                    case "vestuario":
                        if (lojas[i] instanceof Vestuario) contador++;
                        break;
                    default:
                        return -1;
                }
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaMaisCara = null;
        double maisCaro = 0;

        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i] instanceof Informatica){
                Informatica lojaInformatica = (Informatica) lojas[i]; //
                
                if (lojaInformatica.getSeguroEletronicos() > maisCaro){
                    maisCaro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCara = lojaInformatica;
                }
            }
        }
        return lojaMaisCara;
    }

    public String toString(){
        return String.format("SHOPPING %s" + getNome() + "\n\n" +
                            "Localizado em %s" + getEndereco() + "\n\n" +
                            "Lojas disponíveis:\n%s" +getLojas());
    }
}
