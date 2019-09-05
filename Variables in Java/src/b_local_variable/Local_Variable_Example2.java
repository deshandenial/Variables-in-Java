package b_local_variable;

public class Local_Variable_Example2
{
	
	public static void main(String[] args) 
	{
		Local_Variable_Example2 object=new Local_Variable_Example2();
		object.method3();
		object.method1();
		object.method2();
		
	}
	
	public void method1()
	{
		float dob=25.11f;
		
		System.out.println("print dob value:"+dob);
		
		
	}
	
	public void method2()
	{
		String parentname = "raj";
		System.out.println("print parent name:"+parentname);
	}
	
	public void method3()
	{
		boolean s=true;
		System.out.println("print boolean value:"+s);
	}

}
