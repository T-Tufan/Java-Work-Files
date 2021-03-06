package TasarımDesenleri.FactoryPattern;

public class TelFactory {

	public static Telefon getTelefon(String model,String batarya,int en, int boy) {
		Telefon telefon; 
		if("S8".equalsIgnoreCase(model)) {
			telefon = new S8(model,batarya,en,boy);
		}
		else if("S9".equalsIgnoreCase(model)) {
			telefon = new S9(model,batarya,en,boy);
		}else {
			throw new RuntimeException("Ge�erli bir model de�il");
		}
		return telefon;
	}
}
