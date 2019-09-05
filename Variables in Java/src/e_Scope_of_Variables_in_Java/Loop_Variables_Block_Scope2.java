package e_Scope_of_Variables_in_Java;

public class Loop_Variables_Block_Scope2 

{

// type - 1 : A variable declared inside pair of brackets “{” and “}” in a method has scope withing the brackets only.
	
			/*public static void main(String[] args) 
			{
				for(int i=0;i<4;i++)
				{
					System.out.println("i value:"+i);
				}
				
			//  System.out.println(i);
			}*/
	

// type - 1 : Solution(How to handle above problem)	
	
			/*public static void main(String[] args)
			{
				int x;
				for(x = 0 ; x < 4 ; x++)
				{
				 System.out.println("x value:"+x);
				}
				System.out.println("out side x value:"+x);
			}*/
	
// type - 2 : tricky example of loop scope
	
	/*public static void main(String[] args) 
	{
		int a=5;
		for(int a = 10 ; a < 20 ; a++ )
		{
			System.out.println("print a values:"+a);
		}
		// Note:- In C++, it will run.But in java it is an error because in java,name of variable of inner and outer loop must be different.
	}*/
	
	
 // type - 3 : 
	
	/* public static void main(String[] args) 
	 {
		 {
		 int x=5;
		 		{
		 			int x=10;
		 			System.out.println("x value:"+x);
		 		}
		 		
		 }
		
   	}*/
	
	public static void main(String[] args) 
	{
		
		for(int a=0;a<10;a++)
		{
			System.out.println("print a values:"+a);
		}
		int a=20;
		System.out.println("print a values:"+a);
	}
	
}
