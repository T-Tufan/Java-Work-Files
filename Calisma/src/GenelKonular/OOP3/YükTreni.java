package GenelKonular.OOP3;

public class YükTreni extends Tren {
	
	private double maxAgırlık;
	private String tasınanMadde;

	public YükTreni(String marka, String model, String renk, int hız, double güç, String güçTipi, int vagonSayı,
			String amaç, double maxAgırlık, String tasınanMadde) {
		super(marka, model, renk, hız, güç, güçTipi, vagonSayı, amaç);
		this.maxAgırlık = maxAgırlık;
		this.tasınanMadde = tasınanMadde;
	}
	
	public YükTreni(double maxAgırlık, String tasınanMadde) {
		super();
		this.maxAgırlık = maxAgırlık;
		this.tasınanMadde = tasınanMadde;
	}

	public double getMaxAgırlık() {
		return maxAgırlık;
	}
	public void setMaxAgırlık(double maxAgırlık) {
		this.maxAgırlık = maxAgırlık;
	}
	public String getTasınanMadde() {
		return tasınanMadde;
	}
	public void setTasınanMadde(String tasınanMadde) {
		this.tasınanMadde = tasınanMadde;
	}

	@Override
	public String toString() {
		return "YükTreni [maxAgırlık=" + maxAgırlık + ", tasınanMadde=" + tasınanMadde + ", getGüçTipi()="
				+ getGüçTipi() + ", getVagonSayı()=" + getVagonSayı() + ", getAmaç()=" + getAmaç() + ", getMotorGücü()="
				+ getMotorGücü() + ", getHız()=" + getHız() + ", getMarka()=" + getMarka() + ", getModel()="
				+ getModel() + ", getRenk()=" + getRenk() + "";
	}
	@Override
	public void aracSes() {
		System.out.println("Çuf Çuf Çuf !!!");
	}
}
