package GenelKonular.OOP5;

public class Main5 {
	public static void main(String args[]) {
		AmasyaElma amasyaElma = new AmasyaElma();
		Object aslan = new Aslan();
		IEatable tavuk = new Tavuk();
		Elma elma = new Elma();
		Object[] nesneler = new Object[] {amasyaElma,aslan,elma,tavuk};

		for(Object o : nesneler) {
			if(o instanceof IEatable) {
				((IEatable)o).HowtoEat();
			}
			if(o instanceof ISquueezable) {
				((ISquueezable)o).HowtoSquueezable();
			}
		}
	}
}
