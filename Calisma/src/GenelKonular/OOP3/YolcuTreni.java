package GenelKonular.OOP3;

public class YolcuTreni extends Tren {
	private String yolcuKapasitesi;
	private double biletUcreti;
	public YolcuTreni(String marka, String model, String renk, int hız, double güç, String güçTipi, int vagonSayı,
			String amaç,String yolcuKapasitesi, double biletUcreti) {
		super(marka,model,renk,hız,güç,güçTipi,vagonSayı,amaç);
		this.yolcuKapasitesi = yolcuKapasitesi;
		this.biletUcreti = biletUcreti;
	}
	public String getYolcuKapasitesi() {
		return yolcuKapasitesi;
	}
	public void setYolcuKapasitesi(String yolcuKapasitesi) {
		this.yolcuKapasitesi = yolcuKapasitesi;
	}
	public double getBiletUcreti() {
		return biletUcreti;
	}
	public void setBiletUcreti(double biletUcreti) {
		this.biletUcreti = biletUcreti;
	}
	
	@Override
	public void aracSes() {
		System.out.println("Çuf Çuf!!!");
	}
}