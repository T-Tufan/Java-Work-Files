package GenelKonular.NestedClasses;

public class Local {
	
	public void run() {
		class Yerel {
			int a = 5;

			Yerel(int a) {
				this.a = a;
			}

			public void print() {
				System.out.println(a);
			}
		}
		Yerel y = new Yerel(8);
		y.print();
	}
}
