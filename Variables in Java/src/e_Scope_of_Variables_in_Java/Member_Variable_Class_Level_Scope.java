package e_Scope_of_Variables_in_Java;

public class Member_Variable_Class_Level_Scope 
{
 
//	Member Variables (Class Level Scope):

	//	These variables must be declared inside class (outside any function). 
	//  They can be directly accessed anywhere in class
	
	public int mobilenum;
	public String name;
	
	public void info()
	{
		mobilenum=1234567890;
		name="deshan";
		System.out.println("print name:"+name);
		System.out.println("print mobile:"+mobilenum);
		
	}
	
	public static void main(String[] args) 
	{
		Member_Variable_Class_Level_Scope obj=new Member_Variable_Class_Level_Scope();
		obj.info();
	}
 
}
