package growmingvariables;

public class Integers2 {

	static int p = 100;
	int q = 20;
	int z = 30;

	public static void main(String[] args) {
		Integers2 obj1 = new Integers2();
		obj1.q = 40;
		obj1.z = 100;
		System.out.println(p);
		System.out.println(obj1.q);
		System.out.println(obj1.z);
		display();
		add();

	}

	public static void display() {
		int l = 20;
		int q = 30;
		System.out.println(l);
		System.out.println(q);
	}

	public static void add() {
		int p = 200;
		System.out.println(p);
	}

}
