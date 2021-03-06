package TasarımDesenleri.SingletonPattern;

public class Singleton2 {
	private static Singleton2 singleton2;
	
	private Singleton2() {
		System.out.println("Singleton2 olu�turuldu");
	}
	
	public synchronized static Singleton2 getSingleton2() {
		if(singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
