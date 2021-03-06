package GenelKonular.NestedClasses;

public class Static {
	private int a = 10;
	private static int b = 3;
	public static class Inner3 {
		int a=1;
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(b);
		}
	}
}
