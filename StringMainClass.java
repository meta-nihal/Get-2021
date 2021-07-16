package scf;
import java.util.Scanner;
public class StringMainClass {
  
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String []args)
	{
		String str1;
		String str2;
		
		int choice;
		
		do
		{
			System.out.println();
			System.out.println("1. Compare Strings ");
			System.out.println("2. Reverse the string");
			System.out.println("3. Change character case");
			System.out.println("4. Largest word in the string");
			System.out.println("5. Exit");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: sc.nextLine();
				    System.out.println("Enter String1");
			        str1=sc.nextLine();
			        System.out.println("Enter String2");
			        str2=sc.nextLine();
			        int result=Operations.areEqual(str1,str2);
			        if(result==1)
			        	System.out.println("Both strings are equal");
			        else
			        	System.out.println("Strings are not equal");
			        
			        break;
			        
			case 2: sc.nextLine();
				    System.out.println("Enter string to be reversed");
			        str1=sc.nextLine();
			        str2=Operations.reverse(str1);
			        System.out.println("Reverse string is "+str2);
			        break;
			       
			case 3: sc.nextLine();
				    System.out.println("Enter string whose characters need to be toggled");
			        str1=sc.nextLine();
			        str2=Operations.reverseCase(str1);
			        System.out.println("String after toggle case is "+str2);
			        break;
			        
			case 4: sc.nextLine();
				    System.out.println("Enter string from which largest word need to found");
			        str1=sc.nextLine();
			        str2=Operations.largestWord(str1);
			        System.out.println("Largest word in the given string is "+str2);
			        break;
			        
			case 5: return;
			       
			default:System.out.println("Invalid choice");
			        
			}        
			        	
			
		}while(choice!=5);
		
	}
}