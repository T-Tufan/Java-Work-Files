package GenelKonular.Collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import GenelKonular.OOP2.Adres;
import GenelKonular.OOP2.Dersler;
import GenelKonular.OOP2.Okul;
import GenelKonular.OOP2.Student;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				HashMap<Integer, String> plaka = new HashMap<>();
				plaka.put(01, "Adana");
				plaka.put(07,"Antalya");
				plaka.put(34,"İstanbul");
				plaka.put(60,"Tokat");
				plaka.put(61,"Trabzon");
				
				Set<Integer> anahtarlar = plaka.keySet();
				for(Integer a : anahtarlar) {
					System.out.println(plaka.get(a));
				}
				
				
				////////////////Nesne Örnek/////////////////
				///////////////OOP2 Paketi kullanıldı./////////////
				ArrayList<Dersler> derslers = new ArrayList<>();
				Adres adres = new Adres (" 11"," 2343 Sokak"," Adem Yavuz Mahallesi"," Gebze"," Kocaeli"," Türkiye");
				Adres okulAdres = new Adres(" 25","Cumhiriyet Sokak","Mimar Sinan Mahallesi","Merkez","Yalova","Türkiye");
				Dersler kriptoloji = new Dersler("Kriptloji",4.5,4);
				Dersler algoritma = new Dersler("Algoritma", 6, 5);
				derslers.add(algoritma);
				derslers.add(kriptoloji);
				Okul YalovaÜni = new Okul("Yalova Üniversitesi","Üniversite",okulAdres);
				Student tugay = new Student("Tugay", "150101056", 539286379,adres,YalovaÜni, derslers);
				
				HashMap<String, Student> ogr = new HashMap<>();
				ogr.put(tugay.getOkulNo(), tugay);
				System.out.println();
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir öğrenci numarası girin.");
				String gelendeger = scan.next();
				
				Set<String> ogrno = ogr.keySet();
				
				for (String no : ogrno) {
					if(gelendeger.equals(no)) {
						System.out.println(ogr.get(no));
					}else {
						System.out.println("Bu numara ile kayıtlı öğrenci yok!");
					}
				}
	}

}
