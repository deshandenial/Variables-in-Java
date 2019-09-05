package e_Scope_of_Variables_in_Java;

public class Local_Variables_Method_Level_Scope 
{

	
    public void method1(int x) 
    { 
    	int y;
    	y = 44; 
    	System.out.println("y: " + y); 
    	System.out.println("x: " + x);
    } 
  
    public static void main(String args[]) 
    { 
    	Local_Variables_Method_Level_Scope t = new Local_Variables_Method_Level_Scope(); 
        t.method1(5); 
    } 

}
