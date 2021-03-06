package GenelKonular.OOP3;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("//////////////////Araçlar////////////////");
				System.out.println("////////////////////////////////////////");
				
				Tren tren1 = new YükTreni("Fleischmann", "bro3","Siyah",220,25000,"Kömürlü Tren",15,"Yük Taşıma",800,"Kömür");
				System.out.println(tren1);
				YükTreni tren2 = new YükTreni(30000,"Külçe Altın");
				tren2.setHız(170);
				YolcuTreni tren3 = new YolcuTreni("Fleischman", "bro4", "Koyu Mavi", 340, 20000,"Elektrikli Tren" , 12, "Yolcu Taşıma","600",3.5);
				Tren tren4 = new YolcuTreni("Fleischmann", "bro4","Siyah",280,22000,"Elektrikli Tren",15,"Yük Taşıma","800",5);
				
				Tren tren5 = tren3;
				tren3.aracSes();
				tren3 = (YolcuTreni)tren5;
				System.out.println(tren2);
				tren1.aracSes();
				
				tren3.aracSes();
				tren4.aracSes();
				tren2.aracSes();
				if(tren3.equals(tren1)) {
					System.out.println("Aynı renk Tren!");
				}else {
					System.out.println("Farklı renk Tren!");
				}
	}

}
