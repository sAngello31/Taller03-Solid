
public class Auto {
    String matricula;
    String marca;
    TipoCarro tipo;

    public Auto(String matricula, String marca, TipoCarro tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.tipo = tipo;
    }

    public void cambio(){
        if(tipo == TipoCarro.AUTOMATICO){
            //Proceso para dar un cambio en automatico
        } else{
            //Proceso para dar un cambio en manual
        }
    }
    
}
