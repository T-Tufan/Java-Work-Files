package TasarımDesenleri.AdapterDesignPattern2;

public abstract class Mercedes {
	public static final String marka = "Mercedes";
	public String model;
	public int fiyat;
	public String kasatipi;
	
	public Mercedes(String model, int fiyat, String kasatipi) {
		super();
		this.model = model;
		this.fiyat = fiyat;
		this.kasatipi = kasatipi;
	}

	public Mercedes() {
		// TODO Auto-generated constructor stub
	}

	public abstract boolean OzelUretimMi();
	public abstract int ArabaSat();
}
