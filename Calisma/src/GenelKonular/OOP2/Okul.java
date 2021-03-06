package GenelKonular.OOP2;

public class Okul {
	private String isim;
	private String seviye;
	private Adres adres;
	
	public Okul(String isim, String seviye, Adres adres) {
		super();
		this.isim = isim;
		this.seviye = seviye;
		this.adres = adres;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSeviye() {
		return seviye;
	}
	public void setSeviye(String seviye) {
		this.seviye = seviye;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	@Override
	public String toString() {
		return "Okul [isim=" + isim + ", seviye=" + seviye + ", adres=" + adres + "]";
	}
	
	
}
