package classes.exercise05;

import java.util.Calendar;
import java.util.TimeZone;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {

        if(dia >=1 && dia <= 31){
            this.dia = dia;
        }
        else {
            throw new IllegalArgumentException("Dia inválido");
        }
        if(mes >=1 && mes <= 12){
            this.mes = mes;
        }
        else {
            throw new IllegalArgumentException("Mês inválido");
        }

        if(ano != 0){
            this.ano = ano;
        }
        else {
            throw new IllegalArgumentException("Ano inválido");
        }
    }

    public Data(){

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        this.dia = calendar.get(Calendar.DATE);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.ano = calendar.get(Calendar.YEAR);
    }

    public String toString(){

        return Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
    
    }    

boolean sim;
    public String avancarDia(){
    
            if(this.dia < 31){ 
                this.dia = this.dia+1; 
            }else{
                this.dia = 1; 
                if(this.mes < 12){
                    this.mes = this.mes+1; 
                }
                else{
                    this.mes = 1;
                    this.ano = this.ano + 1;
                }
            }
            
        
        String saida = Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
        System.out.println(saida);

        return saida;


    }
  
    


}
