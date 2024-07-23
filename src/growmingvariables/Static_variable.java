package growmingvariables;

public class Static_variable {
	String myInstanceVar="instance variable"; // Instance variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_variable obj = new Static_variable();
		Static_variable obj2 = new Static_variable();
		Static_variable obj3 = new Static_variable();
			System.out.println(obj.myInstanceVar);
			System.out.println(obj2.myInstanceVar);
			System.out.println(obj3.myInstanceVar);

			obj2.myInstanceVar = "Changed Text";

			System.out.println(obj.myInstanceVar);
			System.out.println(obj2.myInstanceVar);
			System.out.println(obj3.myInstanceVar);
			}
	}
/* OUT PUT 
 * instance variable
instance variable
instance variable
instance variable
Changed Text
instance variable


 */

