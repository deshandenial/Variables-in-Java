package c_instance_variable;

public class Instance_Variable_Example1
{
	//Instance Variable declaration
	String name="deshan";
	
	
	//method definition
		public void method1()
		{
			
			System.out.println("print name of the candidate:"+name);
		}
	
	//main method definition
	public static void main(String[] args) 
	{
	  	Instance_Variable_Example1 object = new Instance_Variable_Example1();
	  	object.method1();
	}
	
	

}
