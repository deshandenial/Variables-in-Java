package d_static_variable;

public class Static_Variable_Example3 
{
	static String name; // static variable declaration
	static int age;
	
	// static method declaration
	public static void method1()
	{
		System.out.println("print name:"+name);
		System.out.println("print age:"+age);
	}

	//main method declaration
	public static void main(String[] args) 
	{
		 name="deshan";
		 age=27;
       method1();		
	}
}
