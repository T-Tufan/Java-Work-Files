package TasarımDesenleri.CompositeDesignPatternProblem;

import java.math.BigDecimal;

public class Urun {
	private String ad;
	private BigDecimal fiyat;
	
	public Urun() {
		super();
	}

	public Urun(String ad, BigDecimal fiyat) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
	}
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public BigDecimal getFiyat() {
		return fiyat;
	}

	public void setFiyat(BigDecimal fiyat) {
		this.fiyat = fiyat;
	}

	
	
}
