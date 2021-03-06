package TasarımDesenleri.AdapterDesignPattern2;

public class AmgGt extends Mercedes{
	//public static final String model = "CLA 180" ;
	public AmgGt( String model, int fiyat, String kasatipi) {
		super(model,fiyat,kasatipi);
		
	}
	public AmgGt() {
		super();
	}
	@Override
	public boolean OzelUretimMi() {
		// TODO Auto-generated method stub
		System.out.println("AMG GT özel üretim bir araçtır!");
		return true;
	}
	@Override
	public int ArabaSat() {
		System.out.println(super.marka+" "+model+" model araç "+fiyat+" Türk Lirasına satış listesine koyulmuştur");
		return fiyat;
	}

}
