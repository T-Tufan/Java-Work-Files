package GenelKonular.OOP4;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel isci1 = new Isci();
		Personel ogretmen1 = new Ogretmen();
		Müdür müdür = new Müdür();
		müdür.IseAl(isci1);
		müdür.IseAl(ogretmen1);
		müdür.Terfi(ogretmen1);
		müdür.Terfi(isci1);
	}

}
