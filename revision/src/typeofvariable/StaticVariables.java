package typeofvariable;

public class StaticVariables {
public static String str="Class or Static Variable";
	public static void main(String[] args) {
		StaticVariables obj = new StaticVariables();
		StaticVariables obj1 = new StaticVariables();
		StaticVariables obj2 = new StaticVariables();
		
		
		//All three will display "class or static variable"
		System.out.println(obj.str);
		System.out.println(obj1.str);
		System.out.println(obj2.str);
		
		
		
		//changing the value of static variable using obj2
		
		obj2.str="Change the method";
		
		
		//all three will display 'change the method '
		System.out.println(obj.str);
		System.out.println(obj1.str);
		System.out.println(obj2.str);
		
		
		
		

	}

}
