public class PagoPayPal implements Pagable {
    boolean isLogged;

    @Override
    public void realizarCobro(double monto) {
       if(!isLogged){
        Loggin();
       }

       //Proceso de pago
        
    }

    public boolean Loggin(){
        //Proceso de loggearse
        return true;
    }
    
}
