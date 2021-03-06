package GenelKonular.OOP3;

public class Tren extends Arac {
	private String güçTipi;
	private int vagonSayı;
	private String amaç;
	
	public Tren() {
		super();
	}
	public Tren(String güçTipi, int vagonSayı,
			String amaç) {
		super();
		this.güçTipi = güçTipi;
		this.vagonSayı = vagonSayı;
		this.amaç = amaç;
	}
	public Tren(String marka, String model, String renk, int hız, double güç, String güçTipi, int vagonSayı,
			String amaç) {
		super(marka, model, renk, hız, güç);
		this.güçTipi = güçTipi;
		this.vagonSayı = vagonSayı;
		this.amaç = amaç;
	}
	public String getGüçTipi() {
		return güçTipi;
	}
	public void setGüçTipi(String güçTipi) {
		this.güçTipi = güçTipi;
	}
	public int getVagonSayı() {
		return vagonSayı;
	}
	public void setVagonSayı(int vagonSayı) {
		this.vagonSayı = vagonSayı;
	}
	public String getAmaç() {
		return amaç;
	}
	public void setAmaç(String amaç) {
		this.amaç = amaç;
	}
	@Override
	public String toString() {
		return "Tren [güçTipi=" + güçTipi + ", vagonSayı=" + vagonSayı + ", amaç=" + amaç + ", getMotorGücü()="
				+ getMotorGücü() + ", getHız()=" + getHız() + ", getMarka()=" + getMarka() + ", getModel()="
				+ getModel() + ", getRenk()=" + getRenk() + "";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this.getRenk() == ((Arac)obj).getRenk()) {
			return true;
		}else {
			return false;
		}
	}
}
