package instance_Variable_Hiding_in_Java;

class class1
{
	private int a = 10 ;
	void method1()
	{
		int a = 50 ;
		System.out.println("print a value:"+this.a);
		System.out.println("print a value:"+a);
	}
}


public class Democlass
{
	public static void main(String[] args) 
	{
		class1 obj=new class1();
		obj.method1();		
		
	}

}
