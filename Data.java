public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){  
        int diasMes;    
        this.ano = ano;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
            diasMes = 30;
        } 
        else if (mes == 2){
            if (verificaAnoBissexto() == true){
                diasMes = 29;
            } else diasMes = 28;
        } else diasMes = 31;

        if (dia <= diasMes && mes <= 12 && ano >= 2000){
            this.dia = dia;
            this.mes = mes;
        } 
        else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

    }

    //getters
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }

    //setters
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public boolean verificaAnoBissexto(){
        if (this.ano % 4 == 0 && (this.ano % 100 != 0 || this.ano % 400 == 0)){
            return true;
        } else return false;
    }

    public String toString(){
        return String.format("%s/%s/%s", getDia(), getMes(), getAno());
    }
}
