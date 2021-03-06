package GenelKonular.OOP;

public class Araba {
	private int hız ;
	private String marka, model, renk;
	private double fiyat;
	private boolean calisiyorMu;
	
	public Araba() {
		// TODO Auto-generated constructor stub
	}

	public Araba(int hız, String marka, String model, String renk, double fiyat, boolean calisiyorMu) {
		super();
		this.hız = hız;
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.fiyat = fiyat;
		this.calisiyorMu = calisiyorMu;
	}

	public int getHız() {
		return hız;
	}

	public void setHız(int hız) {
		this.hız = hız;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}

	public boolean isCalisiyorMu() {
		return calisiyorMu;
	}

	public void setCalisiyorMu(boolean calisiyorMu) {
		this.calisiyorMu = calisiyorMu;
	}
	
	public String BoolToString(Araba x) {
		String durum ="";
		if(x.isCalisiyorMu() == true) {
			 durum = "Çalışıyor.";
		}else {
			durum ="Çalışmıyor.";
		}
		return durum;
	}
}

