public class Reloj 
{
    protected int segundos;
    protected int minutos;
    protected int horas; 

    /**Debe inicializar a la media noche o medio dia 12:00:00*/
    public Reloj(){
        segundos=00;
        minutos=00;
        horas=12;
    }

    /**Inicializa de acuerdo con los parametros*/
    public Reloj(int segundos, int minutos, int horas){
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;  
    }

    //COMPLETE GETTER Y SETTER
    public int getSegundos(){
        return this.segundos;
    }//end method getSegundos

    /**Metodo de modificación a la propiedad segundos*/
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }//end method setSegundos

    /**Metodo de acceso a la propiedad minutos*/
    public int getMinutos(){
        return this.minutos;
    }//end method getMinutos

    /**Metodo de modificación a la propiedad minutos*/
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }//end method setMinutos

    /**Metodo de acceso a la propiedad horas*/
    public int getHoras(){
        return this.horas;
    }//end method getHoras

    /**Metodo de modificación a la propiedad horas*/
    public void setHoras(int horas){
        this.horas = horas;
    }//end method setHoras

    /**Metodo para avanzar el segundero*/ 
    public void avanzarSegundero(){

        if(segundos<59){
            segundos++;
        }
        else if(horas==12 && minutos==59 && segundos==59){
            horas=01;
            minutos=00;
            segundos=00;
        }
        else if(minutos==59 && segundos==59){
            minutos=00;
            segundos=00;
            horas++;
        }
        else if(segundos==59){
            segundos=00;
            minutos++;
        }
    }

    /**Metodo para retroceder el segundero*/ 
    public void retrocederSegundero(){
        if(segundos>0){
            segundos--;
        }
        else if(horas==1 && minutos==0 && segundos==0){
            horas=12;
            minutos=59;
            segundos=59;
        }
        else if(minutos==0 && segundos==0){
            minutos=59;
            segundos=59;
            horas--;
        }
        else if(segundos==0){
            segundos=59;
            minutos--;
        }
    }

    /**Metodo para avanzar el minutero*/ 
    public void avanzarMinutero(){
        if(minutos<59){
            minutos++;
        }
        else if(horas==12 && minutos==59 ){
            horas=01;
            minutos=00;
        }
        else if(minutos==59){
            minutos=00;
            horas++;
        } 
    }

    /**Metodo para avanzar el minutero*/ 
    public void retrocederMinutero(){
        if(minutos>0){
            minutos--;
        }
        else if(horas==1 && minutos==0 ){
            horas=12;
            minutos=59;
        }
        else if(minutos==0){
            minutos=59;
            horas--;
        }  
    }

    /**Metodo para avanzar el horario*/ 
    public void avanzarHorario(){
        if(horas<12){
            horas++;
        }
        else{
            horas=01;
        }
    }

    /**Metodo para avanzar el horario*/ 
    public void retrocederHorario(){
        if(horas>1){
            horas--;
        }
        else{
            horas=12;
        }
    }
}