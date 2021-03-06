package GenelKonular.Collection;

import java.util.LinkedHashSet;

public class LinkedHastSet {

	public static void main(String[] args) {
		//iLk giren ilk çıkar mantığı var.
		//Tekrar eden veriler yoktur.
		// TODO Auto-generated method stub
		LinkedHashSet gunler = new LinkedHashSet<>();
		gunler.add("Pazartesi");
		gunler.add("Salı");
		gunler.add("Çarşamba");
		gunler.add("Perşembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		gunler.add("Pazartesi");
		
		gunler.forEach(item -> System.out.print(item +","));
	}

}
