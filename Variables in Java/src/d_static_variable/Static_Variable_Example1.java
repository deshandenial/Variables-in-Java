package d_static_variable;



public class Static_Variable_Example1
{

	static String name="deshan"; // only variable as declared as static but method level no mention
	static int age=29;           // Static Variable Declaration
	
	// method declaration
	
	public void method1()
	{
		System.out.println("print name:"+name);
		System.out.println("print age:"+age);
	}
	
	// main method declaration
	public static void main(String[] args) 
	{
		Static_Variable_Example1 obj=new Static_Variable_Example1();
		obj.method1();
	}
}

