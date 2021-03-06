package GenelKonular.Collection2;

import java.util.ArrayList;

import GenelKonular.OOP3.Tren;
import GenelKonular.OOP3.YükTreni;



public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arabalar = new ArrayList<String>();
		arabalar.add("Opel");
		arabalar.add("Mercedes");
		arabalar.add("Bmw");
		arabalar.add("Volvo");
		
		arabalar.remove("Opel");
		arabalar.add("Opel");
		arabalar.add(1, "Renault");
		System.out.println(arabalar.get(1)+"\n");
		for(String s : arabalar) {
			System.out.println(s);
		}
		
		ArrayList<Tren> trens = new ArrayList<Tren>();
		YükTreni yüktreni1 = new YükTreni("Fliescmarks","bow5","Koyu Kırmızı",120,15000,"Kömürlü Tren",20,"Yük Treni",500,"Kömür");
		trens.add(yüktreni1);
		System.out.println(trens.get(0));
	}
}
