import java.util.Scanner;
public class PolyMain {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter the highest degree of the polynomial");
		int highestDegree=sc.nextInt();
		
		int []PolyArray=new int[highestDegree+1];
		
		System.out.println("Enter no of terms in polynomial");
		int terms=sc.nextInt();
		System.out.println("Enter the power and coefficient of variable");
		int coeff,power;
		for(int i=0;i<terms;i++)
		{
			power=sc.nextInt();
			coeff=sc.nextInt();
			PolyArray[power]=coeff;
		}
		
		int choice;
		Poly p1=new Poly(PolyArray);
		
		do {
			
			System.out.println();
			System.out.println("1. evaluate the polynomial");
			System.out.println("2. degree of the polynomial");
			System.out.println("3. add the polynomial");
			System.out.println("4. multiply the polynomial");
			System.out.println("5. Exit");
			System.out.println("Enter choice");
			
			choice=sc.nextInt();
		switch(choice)
		{
		
		  case 1 :System.out.println("Enter the value of varible");
		          float value=sc.nextFloat();
			      float result=p1.evaluate(PolyArray, value);
			      System.out.println("The value of polynomial is "+result);
			      break;
			      
		  case 2 : int degree=p1.degree(PolyArray);
		           System.out.println("The degree of polynomial is "+degree);
		           break;
		           
		  case 3 : System.out.println("Enter the highest degree of the polynomial");
			       highestDegree=sc.nextInt();
			
			       int []PolyArray1=new int[highestDegree+1];
			
		           System.out.println("Enter no of terms in polynomial");
			       terms=sc.nextInt();
			       System.out.println("Enter the power and coefficient of variable");
			       //p1=new Poly(PolyArray);
			       Poly p2=new Poly(PolyArray1);
				   for(int i=0;i<terms;i++)
					{
						power=sc.nextInt();
						coeff=sc.nextInt();
						PolyArray1[power]=coeff;
					}
				   int []resultArray=p1.addPoly(p1, p2);
				   System.out.print("The expression is : ");
				   for(int i=resultArray.length-1;i>=0;i--)
				   {  
					   System.out.print(resultArray[i]+"X^"+i+" ");
				   }
				   break;
	     
		  case 4 : System.out.println("Enter the highest degree of the polynomial");
	               highestDegree=sc.nextInt();
	
	               int []PolyArray2=new int[highestDegree+1];
	
                  System.out.println("Enter no of terms in polynomial");
	              terms=sc.nextInt();
	              System.out.println("Enter the power and coefficient of variable");
	              //p1=new Poly(PolyArray);
	              p2=new Poly(PolyArray2);
				  for(int i=0;i<terms;i++)
				  {
						power=sc.nextInt();
						coeff=sc.nextInt();
						PolyArray2[power]=coeff;
				   }
		          int []resultArray1=p1.multiPoly(p1, p2);
		          System.out.print("The expression is : ");
		          for(int i=resultArray1.length-1;i>=0;i--)
		           {
			          System.out.print(resultArray1[i]+"X^"+i+" ");
		           }
		            break;	   
		  case 5 :  break;
		}
		}while(choice!=5);
	}
}
