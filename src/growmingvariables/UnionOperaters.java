package growmingvariables;

public class UnionOperaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		int num2 = 200;

		// - operator
		int inversenum = -num1;
		System.out.println("Oppsite of Number:" + inversenum);

		// + operator
		num1++;

		// --decrement
		num2--;
		System.out.println("num1++ is:" + num1);
		System.out.println("num2--is:" + num2);

		--num2;
		++num1;
		System.out.println("predecrement of num2" + num2);
		System.out.println("preincrement of num1" + num1);
		RelationalsOperaters();


	}

	public static void RelationalsOperaters() {
		int num1 = 10;
		int num2 = 50;
		if (num1 != num2) {
			System.out.println("num1 and num2 are not equal");
		} else {
			System.out.println("num1 and num2 are equal");

		}
		if (num1 > num2) {
			System.out.println("num1 is greater than num2  ");
		} else {
			System.out.println("num1 is not greater than num2 ");
		}
		if (num1<num2) {
			System.out.println("Num1 is ");
	}
	
		
	}

}
