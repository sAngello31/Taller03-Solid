
public class CuentaAhorros{
    String numeroCuenta;
    double balance;
    
    
//  Adaptado del siguiente video: https://www.youtube.com/watch?v=n-JDQu2qi4o
    
    public CuentaAhorros(String numeroCuenta,double balance){
        this.numeroCuenta=numeroCuenta;
        this.balance=balance;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void depositar(int valor){
        //metodo para depositar
    }
    
}
