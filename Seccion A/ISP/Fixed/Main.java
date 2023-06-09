package ejemploISP;

public class Main {
	public static void main(String [] args) {
		Iphone iph = new Iphone();
		Ipod ipod = new Ipod();
		System.out.println(iph.getTipo());
		System.out.println(ipod.getTipo());
		
	}
}

