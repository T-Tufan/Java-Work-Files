package GenelKonular.OOP3;

public class Arac {
	private String marka;
	private String model;
	private String renk;
	private int hız;
	private double motorGücü;
	public Arac() {
		super();
	}
	public Arac(String marka, String model, String renk,int hız,double güç) {
		super();
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.hız = hız;
		this.motorGücü = güç;
	}
	public double getMotorGücü() {
		return motorGücü;
	}
	public void setMotorGücü(double motorGücü) {
		this.motorGücü = motorGücü;
	}
	public int getHız() {
		return hız;
	}
	
	public void setHız(int hız) {
		this.hız = hız;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public void aracSes() {
		System.out.println("Arac sınıfı sesi");
	}
	

}
