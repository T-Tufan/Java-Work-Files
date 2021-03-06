package TasarımDesenleri.FactoryPattern;

public class S8 implements Telefon{
	public String model;
	public String batarya;
	public int en;
	public int boy;
	
	
	@Override
	public String toString() {
		return "S8 [model=" + model + ", batarya=" + batarya + ", en=" + en + ", boy=" + boy + "]";
	}

	public S8(String model, String batarya, int en, int boy) {
		super();
		this.model = model;
		this.batarya = batarya;
		this.en = en;
		this.boy = boy;
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String batarya() {
		// TODO Auto-generated method stub
		return batarya;
	}

	@Override
	public int En() {
		// TODO Auto-generated method stub
		return en;
	}

	@Override
	public int Boy() {
		// TODO Auto-generated method stub
		return boy;
	}

}
