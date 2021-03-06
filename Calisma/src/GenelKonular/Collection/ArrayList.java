package GenelKonular.Collection;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		//Tekrar eden elemanlar kullan�labilir.
		// TODO Auto-generated method stub
		java.util.ArrayList<Object> country = new java.util.ArrayList<>();
		country.add("Ankara");
		country.add("�stanbul");
		country.add("Trabzon");
		country.add("Ankara");
		
		country.add(1, "Tokat");
		System.out.println("Iterator : ");
		Iterator<Object> itr = country.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nFor each : ");
		country.forEach(i -> System.out.print(i+", "));
		
	}

}
