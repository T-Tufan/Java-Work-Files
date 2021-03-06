package TasarımDesenleri.FactoryPattern;

public class GenelBayi {
	public static void main(String args[]) {
		Telefon s8 = TelFactory.getTelefon("s8", "4000mA", 8, 17);
		Telefon s9 = TelFactory.getTelefon("s9", "4500mA", 9, 18);
		
		System.out.println("s8 için telefon özellikleri");
		System.out.println("--------------------------");
		System.out.println(s8);
		System.out.println("\n");
		System.out.println("s9 için telefon özellikleri");
		System.out.println("--------------------------");
		System.out.println(s9);
		
		Araba opel = ArabaFactory.getAraba("Opel", "İnsignia", 0.40 , 15000, "Siyah");
		Araba mercedes = ArabaFactory.getAraba("Mercedes", "CLA 180",0.70,8000,"Koyu Mavi");
		System.out.println("Opel için araba özellikleri");
		System.out.println("--------------------------");
		System.out.println(opel);
		System.out.println("\n");
		System.out.println("Mercedes için araba özellikleri");
		System.out.println("--------------------------");
		System.out.println(mercedes);
	}
}
