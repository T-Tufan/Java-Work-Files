package TasarımDesenleri.CompositeDesignPatternSolve;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Paket implements Fiyatlanabilir{
	private String ad;
	ArrayList<Urun> urunList;
	
	public Paket(String ad, ArrayList<Urun> urunList) {
		super();
		this.ad = ad;
		this.urunList = urunList;
	}

	@Override
	public BigDecimal getfiyat() {
		// TODO Auto-generated method stub
		return FiyatHesaplamaUtil.gettoplamUrunFiyat(urunList);
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public ArrayList<Urun> getUrunList() {
		return urunList;
	}

	public void setUrunList(ArrayList<Urun> urunList) {
		this.urunList = urunList;
	}
	
}
