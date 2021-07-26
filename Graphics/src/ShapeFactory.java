import java.util.List;
public class ShapeFactory
{
	public static Shape createShape(String str,Point p,List<Integer>list)
	{
		Shape shape;
		if(str.equals("circle"))
		{
			 shape = new Circle(p,list);
		}
		else if(str.equals("triangle"))
		{
			 shape=new Triangle(p,list);
		}
		else if(str.equals("rectangle"))
		{
			 shape = new Rectangle(p,list);
		}
		else  
			shape= new Square(p,list);
		
		return shape;
	}
}

