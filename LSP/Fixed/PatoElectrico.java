package ejemploLiskov;

public class PatoElectrico implements Animal {
	
	private int bateria;
	
	public PatoElectrico(int bat) {
		this.bateria = bat;
	}
	
	public void emitirsonido() {
		if(!tieneBateria()) {
			CargarBateria();
			System.out.println("Cuack!");
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

	public void CargarBateria() {}
	
	public void setPila(int n) {
		this.bateria = n;
	}
	
}
