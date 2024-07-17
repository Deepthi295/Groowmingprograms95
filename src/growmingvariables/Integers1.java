package growmingvariables;

public class Integers1 {

	static int a = 100;// static variable we can use it globally
	int b = 30; //

	void add() {

		int b = 40; // local variable we can use only in that method and other methods des'nt know
		// that b variable is exist

		System.out.println(b);

	}

	public static void main(String[] args) {
		Integers1 lb = new Integers1();
		System.out.println(a);

		int c = 250;// instance variable
		// lb.b();
		System.out.println(lb.b); // we ca'nt print the b value as it is a local variable
		System.out.println(c);
		int a = 1000;
		System.out.println(a);
		lb.sub();
		lb.add();
	}

	public void sub() {
		int a = 10;
		int c = 30;
		System.out.println(a);
		System.out.println(c);
	}

}
