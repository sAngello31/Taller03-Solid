package ejemploLiskov;
//Ejemplo Liskov

public class Main {
	public static void main(String [] args) {
	    Gato gato = new Gato();
	    Perro perro = new Perro();
	    gato.emitirsonido();
	    perro.emitirsonido();
	    
	    PatoElectrico pt = new PatoElectrico(50);
	    pt.emitirsonido();
	    pt.setPila(5);
	    pt.emitirsonido();
	}
}
