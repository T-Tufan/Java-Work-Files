package GenelKonular.NestedClasses;

public class Nonstatic {
	private int a = 10;
	
	public class Inner{
		int a = 1;
		int b = 1;
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Nonstatic.this.a);
		}
	}
	public class Inner2{
		int a = 5;
		int b = 5;
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			Inner inner1 = new Inner();
			System.out.println(inner1.a);
			System.out.println(Nonstatic.this.a);
		}
	}
	public void run() {
		System.out.println(a);
		System.out.println(this.a);
		Inner inner = new Inner();
		System.out.println(inner.a);
	}
}
