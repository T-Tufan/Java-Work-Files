package TasarımDesenleri.AdapterDesignPattern2;

public abstract class BMW {
	public static final String marka = "BMW";
	public String model;
	public int fiyat;
	public String kasatipi;
	
	public BMW(String model, int fiyat, String kasatipi) {
		super();
		this.model = model;
		this.fiyat = fiyat;
		this.kasatipi = kasatipi;
	}

	public BMW() {
		// TODO Auto-generated constructor stub
	}

	public abstract boolean OzelUretimMi();
	public abstract int ArabaSat();
}
