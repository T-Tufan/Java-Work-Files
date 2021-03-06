package GenelKonular.OOP2;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dersler> derslers = new ArrayList<>();
		Adres adres = new Adres(" 11"," 2343 Sokak"," Adem Yavuz Mahallesi"," Gebze"," Kocaeli"," Türkiye");
		Adres okulAdres = new Adres(" 25","Cumhiriyet Sokak","Mimar Sinan Mahallesi","Merkez","Yalova","Türkiye");
		Dersler kriptoloji = new Dersler("Kriptloji",4.5,4);
		Dersler algoritma = new Dersler("Algoritma", 6, 5);
		derslers.add(algoritma);
		derslers.add(kriptoloji);
		Okul YalovaÜni = new Okul("Yalova Üniversitesi","Üniversite",okulAdres);
		Student Tugay = new Student("Tugay", "150101056", 539286379,adres,YalovaÜni, derslers);
		System.out.println(Tugay.toString());
		
	}

}
