import java.util.Scanner;

public class Main_Mathematical {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String []args)
    {
    	System.out.println("Program to find HCF and LCM of two numbers using recursion");
    	System.out.print("Enter first number : ");
    	int firstNumber =sc.nextInt();
    	System.out.print("Enter second number : ");
    	int secondNumber =sc.nextInt();
    	int choice;
        do
        {
        	System.out.println();
        	System.out.println("1. HCF of two number");
        	System.out.println("2. LCM of two number");
        	System.out.println("3. Exit");
        	System.out.print("Enter choice : ");
        	choice=sc.nextInt();
        	switch(choice)
        	{
        	   case 1 : int HCF=Mathematical_Operations.findHCF(firstNumber,secondNumber); 
        	            System.out.println("HCF of two numbers is : "+HCF ); 
        	            break;
        	            
        	   case 2 : int LCM=Mathematical_Operations.findLCM(firstNumber,secondNumber); 
	                    System.out.println("LCM of two numbers is : "+LCM ); 
	                    break;
	                    
        	   case 3 : return;
        	   
        	   default : System.out.println("Invalid choice");
        	}
        	
        }while(choice!=3);
    	
    	
    }
}
