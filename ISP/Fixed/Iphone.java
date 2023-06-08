package ejemploISP;

public class Iphone implements AppleDevice, Operator {
	
	private String num;
	private String ope;
	
	public String getTipo() {
		return "Iphone";
	}
	
	public String getNumero() {
		return num;
	}
	
	public String getOperadora() {
		return ope;
	}
	
	// getters and setters
	
}
