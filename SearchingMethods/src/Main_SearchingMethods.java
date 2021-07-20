import java.util.Scanner;

public class Main_SearchingMethods {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String []args)
    {
    	System.out.println("Program to search an element in array using binary or linear search ");
    	System.out.print("Enter number of elements in array : ");
    	int no_of_elements =sc.nextInt();
    	int inputArray[]=new int[no_of_elements];
    	System.out.print("Enter elements of array : ");
    	for(int i=0;i<no_of_elements;i++)
    		 inputArray[i] =sc.nextInt();
    	
    	System.out.print("Enter element to be searched : ");
    	int element = sc.nextInt();
    	
    	int choice;
        do
        {
        	System.out.println();
        	System.out.println("1. Find index of element using linear search ");
        	System.out.println("2. Find index of elements using binary search ");
        	System.out.println("3. Exit");
        	System.out.print("Enter choice : ");
        	choice=sc.nextInt();
        	
        	switch(choice)
        	{
        	   case 1 : int index=Search.linearSearch(inputArray,0,element); 
        	            System.out.println("Index of the element is : "+index ); 
        	            break;
        	            
        	   case 2 : index=Search.binarySearch(inputArray,0,inputArray.length-1,element); 
	                    System.out.println("Index of the element is : "+index ); 
	                    break;
	                    
        	   case 3 : return;
        	   
        	   default : System.out.println("Invalid choice");
        	}
        	
        }while(choice!=3);
    	
    	
    }
}
