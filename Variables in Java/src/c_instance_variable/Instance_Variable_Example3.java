package c_instance_variable;

class demo
{
	String name; // Instance variable declaration as class level
	int age;	 // Instance variable declaration as class level
}



public class Instance_Variable_Example3 
{
	
	public static void main(String[] args)
	{
		// first object
		demo obj1=new demo();
		obj1.name="deshan";
		obj1.age=26;
		System.out.println("print name:"+obj1.name);
		System.out.println("print age:"+obj1.age);
		
		// second object
		
		demo obj2=new demo();
		obj2.name="desone";
		obj2.age=26;
		System.out.println("print name:"+obj2.name);
		System.out.println("print name:"+obj2.age);
		
		
	}
}
