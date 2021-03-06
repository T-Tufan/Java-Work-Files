package GenelKonular.OOP4;

public class Müdür extends Personel {
	public void IseAl(Personel personel) {
		personel.IseAlındı();
	}
	public void Terfi(Personel personel) {
		//Ogretmen ogr = (Ogretmen)personel;
		//ogr.MaasArttir();

		if(personel instanceof Ogretmen) {
			System.out.println("Terfi verildi.");
			((Ogretmen)personel).MaasArttir();
		}
		else if(personel instanceof Isci) {
			System.out.println("Işçi terfi ettirilemez.");
		}
	}
}
