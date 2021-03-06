package TasarımDesenleri.CompositeDesignPatternProblem;

import java.util.ArrayList;

public class Paket {
	
	private String ad;
	private ArrayList<Urun> uruns;
	
	public Paket() {
		super();
	}
	public Paket(String ad) {
		super();
		this.ad = ad;
		this.uruns = new ArrayList<>();
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public ArrayList<Urun> getUruns() {
		return uruns;
	}
	public void setUruns(ArrayList<Urun> uruns) {
		this.uruns = uruns;
	}
	
	

}
