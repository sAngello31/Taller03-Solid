package ejemploLiskov;

public class PatoElectrico implements Animal {
	
	private int bateria;
	
	public PatoElectrico(int bat) {
		this.bateria = bat;
	}
	
	public void emitirsonido() {
		if(tieneBateria()) {
			System.out.println("Cuack!");
		} else {
			System.out.println("No tengo bateria, recargame :(");
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
	
	public void setPila(int n) {
		this.bateria = n;
	}	
	
}
