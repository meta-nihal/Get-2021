import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FactoryMain {

	static Scanner sc =new Scanner(System.in);
	public static void main(String []args)
	{
		List<Integer> list ;
		List<Shape> shapes= new ArrayList<Shape>();
		Shape shape=null;
		String type;
		int x,y;
		Point p;
		Screen s = new Screen();
		
		boolean flag=true;
		do
		{
		System.out.println("Enter type of shape you want to create");
		type=sc.next();
	    switch(type)
	    {
	    case "circle"    : System.out.println("Enter the coordinates of center of circle i.e. x and y :");
	                       x=sc.nextInt();
	                       y=sc.nextInt();
	                       p=new Point(x,y);
	                       System.out.println("Enter the length of radius of circle");
	                       int radius=sc.nextInt();
	                       list=new ArrayList<>();
	                       list.add(radius);
	                       shape=ShapeFactory.createShape("circle",p,list);
	                       System.out.println("Shape successfully created ");
	                       break;
	                    
	    case "rectangle" : System.out.println("Enter the coordinates of left bottom corner of rectangle ");
	                       x=sc.nextInt();
	                       y=sc.nextInt();
	                       p=new Point(x,y);
	                       System.out.println("Enter length of rectangle ");
	                       int length=sc.nextInt();
	                       System.out.println("Enter breadth of rectange ");
	                       int breadth=sc.nextInt();;
	                       list=new ArrayList<>();
	                       list.add(length);
	                       list.add(breadth);
	                       shape=ShapeFactory.createShape("rectangle", p, list);
	                       System.out.println("Shape successfully created ");
	                       break;
	                       
	    case "triangle"  : System.out.println("Enter the coordinates of left side of base ");
	                       x=sc.nextInt();
	                       y=sc.nextInt();
	                       p=new Point(x,y);
	                       System.out.println("Enter base of triangle ");
	                       int base = sc.nextInt();
	                       System.out.println("Enter the height of triangle ");
	                       int height = sc.nextInt();
	                       list=new ArrayList<>();
	                       list.add(base);
	                       list.add(height);
	                       shape=ShapeFactory.createShape("triangle", p, list);
	                       System.out.println("Shape successfully created ");
	                       break;
	                       
	    case "square"    : System.out.println("Enter the coordinates of left corner bottom of square "); 
	                       x=sc.nextInt();
	                       y=sc.nextInt();
	                       p=new Point(x,y);
	                       System.out.println("Enter the width of square");
	                       int width=sc.nextInt();
	                       list=new ArrayList<>();
	                       list.add(width);
	                       shape=ShapeFactory.createShape("square", p, list);
	                       System.out.println("Shape successfully created ");
	                       break;         
	                       
	           default :  System.out.println("Wrong Input , no further shape can be entered");
	        	          flag=false;
	        	         
	    }
		
	   shapes.add(shape);
		}while(flag);
		
		System.out.println(shapes);
	    
	}
}

