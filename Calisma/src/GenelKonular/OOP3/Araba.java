package GenelKonular.OOP3;


public class Araba extends Arac {
	private String kasatipi;
	private String vites;
	private boolean ozelUretimMi;
	public Araba(String marka, String model, String renk, int hız, double güç, String kasatipi, String vites,
			boolean ozelUretimMi) {
		super(marka, model, renk, hız, güç);
		this.kasatipi = kasatipi;
		this.vites = vites;
		this.ozelUretimMi = ozelUretimMi;
	}
	public String getKasatipi() {
		return kasatipi;
	}
	public void setKasatipi(String kasatipi) {
		this.kasatipi = kasatipi;
	}
	public String getVites() {
		return vites;
	}
	public void setVites(String vites) {
		this.vites = vites;
	}
	public boolean isOzelUretimMi() {
		return ozelUretimMi;
	}
	public void setOzelUretimMi(boolean ozelUretimMi) {
		this.ozelUretimMi = ozelUretimMi;
	}
	
}
