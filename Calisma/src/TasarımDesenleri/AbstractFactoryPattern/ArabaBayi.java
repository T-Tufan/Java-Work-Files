package TasarımDesenleri.AbstractFactoryPattern;

public class ArabaBayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpelFactory  opelFactory = new OpelFactory();
		Araba mercedes = opelFactory.getAraba("Mercedes","Cla 180" , 0.70, 9000, "Koyu Mavi");
		System.out.println(mercedes);
	}
	
}
