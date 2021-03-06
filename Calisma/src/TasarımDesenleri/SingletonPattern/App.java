package TasarımDesenleri.SingletonPattern;


public class App {
	public static void main(String args[]) {

		//Singleton singleton = new Singleton();
		
		//Singleton singleton2 = singleton.getSingleton();
		
		/*Singleton singleton = Singleton.getSingleton();
		System.out.println(singleton.ad);
		Singleton singleton2 = Singleton.getSingleton();
		System.out.println(singleton2.ad);*/
		
		Singleton singleton3 = Singleton.getSingleton();
		Singleton singleton4 = Singleton.getSingleton();
		
		Singleton2 singleton5 = Singleton2.getSingleton2();
		Singleton2 singleton6 = Singleton2.getSingleton2();
		
		

	}
}
