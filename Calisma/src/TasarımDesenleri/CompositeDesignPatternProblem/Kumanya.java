package TasarımDesenleri.CompositeDesignPatternProblem;

import java.util.ArrayList;

public class Kumanya {

	private String ad;
	private ArrayList<Urun> urunList;
	private ArrayList<Paket> paketList;
	
	public Kumanya() {
		super();
	}
	public Kumanya(String ad) {
		super();
		this.ad = ad;
		this.urunList = new ArrayList<>();
		this.paketList = new ArrayList<>();
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
