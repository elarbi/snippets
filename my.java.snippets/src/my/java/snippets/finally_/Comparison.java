package my.java.snippets.finally_;

public class Comparison {
	protected class A {

	}

	static A a1 = new Comparison().new A();
	static A a2 = new Comparison().new A();

	public static void main(String[] args) {
		if (a1 == a2) {
			System.out.println("a1==a2 " + "is TRUE");

		} else {
			System.out.println("a1==a2 " + "is FALSE");
		}
		A a3 = a2;
		if (a3 == a2) {
			System.out.println("a3==a2 " + "is TRUE");
		}


	}
}
