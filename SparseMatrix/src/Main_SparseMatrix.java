import java.util.Scanner;

public class Main_SparseMatrix {
    static Scanner sc =new Scanner(System.in);
    static int sparse[][]=new int[100][3];
    //System.out.println();
	public static void main(String []args)
	{
	int row,column,value;
	System.out.print("enter no of non-zero elements of sparse matrix 1st :");
	int element =sc.nextInt();
	sparseMatrixOperations a =new sparseMatrixOperations(4,4);
	
	for(int i=0;i<element;i++)
	{
		System.out.print("enter row , column and value :");
		row=sc.nextInt();
		column=sc.nextInt();
		value=sc.nextInt();
		
		//sparse[i][0]=row;
		//sparse[i][1]=column;
		//sparse[i][2]=value;
		a.insert(row,column,value);
	}
	
	
	System.out.println();
	System.out.print("enter no of non-zero elements of sparse matrix 2nd : ");
	int element1=sc.nextInt();
	
	sparseMatrixOperations b =new sparseMatrixOperations(4,4);
	for(int i=0;i<element1;i++)
	{
		System.out.print("enter row , column and value :");
		row=sc.nextInt();
		column=sc.nextInt();
		value=sc.nextInt();
		
		//sparse[i][0]=row;
		//sparse[i][1]=column;
		//sparse[i][2]=value;
		b.insert(row,column,value);
	}
	
	int choice;
	do
	{
		System.out.println();
		System.out.println("1. Find transpose");
		System.out.println("2. Is matrix symmetric");
		System.out.println("3. Add the matrices");
		System.out.println("4.Multiply matrices");
		System.out.println("5.Exit");
		System.out.print("Enter choice : ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1 : a.transpose();
		         break;
		        
		case 2 : boolean result=a.symmetry();
		         if(result==true)
		        	 System.out.println("It is symmetric");
		         else 
		        	 System.out.println("It is assymetric");
		         break;
		        
		case 3 : a.add(b);
		         break;
		         
		case 4 : a.multiply(b);
		         break;
		         
		case 5 : break;
		
		}
	}while(choice!=5);
  }
}

