package TasarımDesenleri.SingletonPattern;

public class Singleton {
	public String ad;
	public String soyad;
	
	private static Singleton singleton = new Singleton();
	private static int sayac = 0;
	
	private Singleton() {
		System.out.println("Singleton1 olu�turuldu.");
	}
	public static Singleton getSingleton() {
		sayac ++ ;
		System.out.println("Deneme : "+String.valueOf(sayac));
		return singleton;
	}
}
