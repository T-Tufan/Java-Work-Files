package GenelKonular.OOP;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Araba bmw = new Araba(280,"Bmw","M5","Siyah",0.45,false);
		System.out.println("\t "+bmw.getMarka()+" "+bmw.getModel()+"\n\t"
				+ "Araba Hız : "+Integer.toString(bmw.getHız())+"\n\t"
						+ "Araba Renk : "+bmw.getRenk()+"\n\t"
								+ "Araba Fiyat : "+Double.toString(bmw.getFiyat())+" milyon $"+"\n\t"
										+ "Araba Çalışıyor Mu : "+bmw.BoolToString(bmw));
		
		System.out.println(Static.topla(5, 7));
		Static  static1 = new Static();
		System.out.println("Pi sayısı : "+Double.toString(static1.Pi)+"\nTDK açılımı : "+static1.TDK);
	}
}
