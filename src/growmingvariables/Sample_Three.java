package growmingvariables;

public class Sample_Three {
	// instance variable
	public String myVar = "instance variable";

	public void myMethod() {
		// local variable
		String myVar = "Inside Method";
		System.out.println(myVar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object
		Sample_Three obj = new Sample_Three();
		/*
		 * We are calling the method, that changes the value of myVar. We are displaying
		 * myVar again after the method call, to demonstrate that the local variable
		 * scope is limited to the method itself.
		 */
		System.out.println("Calling Method");
		obj.myMethod();
		System.out.println(obj.myVar);
	}

}


/*    out put 
  Calling Method
   Inside Method
    instance variable
*/