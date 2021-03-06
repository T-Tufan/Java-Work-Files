package TasarımDesenleri.CompositeDesignPatternSolve;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Sepet {
	public String ad;
	ArrayList<Fiyatlanabilir> fiyatlanabilirs;
	
	public Sepet(String ad) {
		super();
		this.ad = ad;
		this.fiyatlanabilirs = new ArrayList<>();
	}
	public BigDecimal OdenecekTutar () {
		BigDecimal toplamTutar = BigDecimal.ZERO;		
		for(Fiyatlanabilir fiyatlanabilir : fiyatlanabilirs) {
			toplamTutar = toplamTutar.add(fiyatlanabilir.getfiyat());
		}
		return toplamTutar;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public ArrayList<Fiyatlanabilir> getFiyatlanabilirs() {
		return fiyatlanabilirs;
	}
	public void setFiyatlanabilirs(ArrayList<Fiyatlanabilir> fiyatlanabilirs) {
		this.fiyatlanabilirs = fiyatlanabilirs;
	}
	
}
