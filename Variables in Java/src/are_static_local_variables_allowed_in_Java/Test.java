package are_static_local_variables_allowed_in_Java;




public class Test 
{

	static int demo()
	{
	    static int x = 10; // //Error: Static local variables are not allowed 
		return x--;
		
	}
	
	
	public static void main(String[] args) 
	{
		
		
	}
	
	
}
