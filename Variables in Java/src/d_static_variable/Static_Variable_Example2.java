package d_static_variable;

public class Static_Variable_Example2 
{
	static String name="deshan";  
	static int age= 26;
	
	public static void method1() // static as mention as method level
	{
		System.out.println("print name:"+name);
		System.out.println("print age:"+age);
	}
	
	public static void main(String[] args) 
	{
		method1();
	}

}
