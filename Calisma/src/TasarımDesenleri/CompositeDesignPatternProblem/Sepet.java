package TasarımDesenleri.CompositeDesignPatternProblem;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Sepet {
	private String ad;
	private ArrayList<Urun> urunList;
	private ArrayList<Paket> paketList;
	private ArrayList<Kumanya> kumanyaList;
	
	public ArrayList<Kumanya> getKumanyaList() {
		return kumanyaList;
	}
	public void setKumanyaList(ArrayList<Kumanya> kumanyaList) {
		this.kumanyaList = kumanyaList;
	}
	public Sepet() {
		super();
	}
	public Sepet(String ad) {
		super();
		this.ad = ad;
		this.urunList = new ArrayList<>();
		this.paketList = new ArrayList<>();
		this.kumanyaList = new ArrayList<>();
	}
	
	public BigDecimal getToplamTutar() {
		
		BigDecimal toplamTutar = BigDecimal.ZERO;
		
		for(Urun urun : urunList) {
			toplamTutar = toplamTutar.add(urun.getFiyat());
		}
		
		
		for(Paket paket : paketList) {
			ArrayList<Urun> uruns = paket.getUruns();
			for(Urun paketurun : uruns ) {
				toplamTutar = toplamTutar.add(paketurun.getFiyat());
			}
		}
		for(Kumanya kumanya : kumanyaList) {
			
			ArrayList<Urun> kumanyaürünlist = kumanya.getUrunList();
			ArrayList<Paket> kumanyapaketlist = kumanya.getPaketList();
			
			for(Urun urun : kumanyaürünlist) {
				toplamTutar = toplamTutar.add(urun.getFiyat());
			}
			for(Paket paket : kumanyapaketlist) {
				ArrayList<Urun> uruns2 = paket.getUruns();
				for (Urun urun : uruns2) {
					toplamTutar = toplamTutar.add(urun.getFiyat());
				}
			}
			
		}
		
		System.out.println("Ödenecek Toplam Tutar : "+toplamTutar+" TL");
		return toplamTutar;
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
	public ArrayList<Paket> getPaketList() {
		return paketList;
	}
	public void setPaketList(ArrayList<Paket> paketList) {
		this.paketList = paketList;
	}
	
	
	
}
