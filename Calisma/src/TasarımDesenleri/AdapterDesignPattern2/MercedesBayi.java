package TasarımDesenleri.AdapterDesignPattern2;

public class MercedesBayi {
	
	public int ArabaSat(Mercedes mercedes) {
		System.out.println("!!! Burası Mercedes Bayisi !!!");
		return mercedes.ArabaSat();
	}
}
