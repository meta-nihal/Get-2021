import java.util.Scanner;

public class Main_Area {
	
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int choice;
		double height,width,radius,area;
		
		do
		{
			System.out.println();
			System.out.println("1. Calculate Area of traingles");
			System.out.println("2. Calculate Area of rectangle");
			System.out.println("3. Calculate Area of square");
			System.out.println("4. Calulate Area of circle");
			System.out.println("5. Exit");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Enter width of traingle");
			        width=sc.nextDouble();
			        System.out.println("Enter height of traingle");
			        height=sc.nextDouble();
			        area=Area.triangleArea(height,width);
			        System.out.println("Area of traingle is "+ area);
			        break;
			        
			case 2: System.out.println("Enter width of rectangle");
			        width=sc.nextDouble();
			        System.out.println("Enter height of rectangle");
			        height=sc.nextDouble();;
			        area=Area.rectangleArea(height,width);
			        System.out.println("Area of rectangle is "+area);
			        break;
			       
			case 3: System.out.println("Enter width of square");
			        width=sc.nextDouble();
			        area=Area.squareArea(width);
			        System.out.println("Area of square is "+area);
			        break;
			        
			case 4: System.out.println("Enter radius of circle");
			        radius=sc.nextDouble();
			        area=Area.circleArea(radius);
				    System.out.println("Area of circle is "+area);
			        break;
			        
			case 5: return;
			       
			default:System.out.println("Invalid choice");
			        
			}        
			        	
			
		}while(choice!=5);
	
	}
}
