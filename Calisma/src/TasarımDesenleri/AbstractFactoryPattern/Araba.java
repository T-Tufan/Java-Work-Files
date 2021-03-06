package TasarımDesenleri.AbstractFactoryPattern;

public class Araba {
	
	public String marka ;
	public String model;
	public double fiyat;
	public int km;
	public String renk;
	
	public Araba(String marka, String model, double fiyat, int km, String renk) {
		super();
		this.marka = marka;
		this.model = model;
		this.fiyat = fiyat;
		this.km = km;
		this.renk = renk;
	}
	
	
}
