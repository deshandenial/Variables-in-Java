package c_instance_variable;

public class Instance_Variable_Example2 
{
  String name;     	// Instance Variable declaration
  int age;		    // Instance Variable declaration
  String address;	 // Instance Variable declaration
	 
  
  // method definition
  public void method()
	{
		name="deshan";
		age=25;
		address="nehru street";
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
		
	}
  
  
  // main method definition
	public static void main(String[] args) 
	{
		Instance_Variable_Example2 object=new Instance_Variable_Example2();
		object.method();
	}
	
	
}
