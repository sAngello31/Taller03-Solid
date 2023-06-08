package ejemploLiskov;

public class PatoElectrico implements Animal {
    private int bateria;

    public void emitirsonido () {
        if(!tieneBateria()) {
            return;
            // emitir sonido logic.
        }
    }

    private boolean tieneBateria() {
		System.out.println("Verificando pilas");
		if(bateria >= 50) {
			System.out.println("Tengo bateria");
			return true;
		} else {
			System.out.println("OH OH");
			return false;
		}
	}
    
}
