package jUnitclass;
import java.util.Scanner;

public class MainArrOperations {
  
	//static
	
	public static void main(String []args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in array: ");
		int size=sc.nextInt();
		int []inputArray =new int[size];
		int []outputArray=new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<size;i++)
		{
			inputArray[i]=sc.nextInt();
		}
		
		do
		{
		    System.out.println();
			System.out.println("1. Find size of largest mirror section in the array");
			System.out.println("2. Find number of clumps in the array");
			System.out.println("3. Find array with same numbers in input but with XY pattern");
			System.out.println("4. Split array in two parts such that sum of both are equal");
			System.out.println("5. Exit");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice)
			{
			  case 1 : int size1=ArrOperations.maxMirror(inputArray);
			           System.out.println("Size of largest mirror section in array is "+ size1);
			           break;
			           
			  case 2 : int no_of_clumps=ArrOperations.countClumps(inputArray);
			           System.out.println("Number of clumps in input array is "+no_of_clumps);
			           break;
			           
			  case 3 : System.out.println("Enter value of X ");
			           int X=sc.nextInt();
			           System.out.println("Enter value of Y ");
			           int Y=sc.nextInt();
				       outputArray=ArrOperations.fixXY(X,Y,inputArray);
			           System.out.println("Array which follows XY pattern is ");
			           for(int i=0;i<size;i++)
			           {
			        	   System.out.print(outputArray[i]+" ");
			           }
			           System.out.println();
			           break;
			           
			  case 4 : int index=ArrOperations.splitArray(inputArray);
			           System.out.println("Index at which the input array can be split in two parts is "+index);
			           break;
			           
			  case 5 : break;
			  
			}
			
		}while(choice!=5);
	}
}
