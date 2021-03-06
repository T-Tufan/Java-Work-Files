package TasarımDesenleri.CompositeDesignPatternSolve;

import java.math.BigDecimal;

public class Urun implements Fiyatlanabilir{
	private String ad;
	private BigDecimal fiyat;
	
	public Urun(String ad, BigDecimal fiyat) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
	}

	@Override
	public BigDecimal getfiyat() {
		// TODO Auto-generated method stub
		return fiyat;
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
