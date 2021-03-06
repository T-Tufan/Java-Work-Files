package GenelKonular.OOP2;

public class Dersler {
	private String Isim;
	private double Saat;
	private double Akts;
	public Dersler(String isim, double saat, double akts) {
		super();
		Isim = isim;
		Saat = saat;
		Akts = akts;
	}
	public String getIsim() {
		return Isim;
	}
	public void setIsim(String isim) {
		Isim = isim;
	}
	public double getSaat() {
		return Saat;
	}
	public void setSaat(double saat) {
		Saat = saat;
	}
	public double getAkts() {
		return Akts;
	}
	public void setAkts(double akts) {
		Akts = akts;
	}
	@Override
	public String toString() {
		return "Dersler [Isim=" + Isim + ", Saat=" + Saat + ", Akts=" + Akts + "]";
	}
	
	
}
