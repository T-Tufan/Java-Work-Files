package GenelKonular.OOP3;

public class Uçak extends Arac {
	private int yolcuKapasite;
	private boolean ozelMi;
	public Uçak(String marka, String model, String renk, int hız,double güç,int yolcuKapasite, boolean ozelMi) {
		super(marka,model,renk,hız,güç);
		this.yolcuKapasite = yolcuKapasite;
		this.ozelMi = ozelMi;
	}
	public int getYolcuKapasite() {
		return yolcuKapasite;
	}
	public void setYolcuKapasite(int yolcuKapasite) {
		this.yolcuKapasite = yolcuKapasite;
	}
	public boolean isOzelMi() {
		return ozelMi;
	}
	public void setOzelMi(boolean ozelMi) {
		this.ozelMi = ozelMi;
	}
	
}