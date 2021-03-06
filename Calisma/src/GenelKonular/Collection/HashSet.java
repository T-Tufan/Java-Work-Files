package GenelKonular.Collection;


import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		//Ayn� t�r de�erler 1 adet oalrak ele al�n�r.12.0 de�eri 3 defa girilmi�tir fakat 1 adet olarak kabul edilir.
		int sayac = 0;
		Object deger;
		java.util.HashSet hashSet = new java.util.HashSet();
		hashSet.add("12");
		hashSet.add(12.0);
		hashSet.add(12.0);
		hashSet.add(12.0);
		hashSet.add(13.0);
		hashSet.add(true);
		hashSet.add(null);
		
		hashSet.remove(null);
		Iterator itr = hashSet.iterator();
		System.out.println("12 var m�?");
		System.out.println(hashSet.contains(12.0));
		System.out.println("D�ng�");
		while(itr.hasNext()) {
			
			deger = itr.next();
			System.out.println("De�er : "+deger.toString());
			
			if(deger.equals(12.0)) {
				sayac = sayac+1;
				System.out.println("sayac : "+sayac);
			}
		}
		
	}

}
