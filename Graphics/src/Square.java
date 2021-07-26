import java.util.List;

public class Square implements Shape{

	double width;
	double distance;
	Point p;
	int x,y;
	public Square(Point p, List<Integer> list) {
		this.p=p;
		this.width=list.get(0);
	}

	@Override
	public double getArea() {
		double area=width*width;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter=4*width;
		return perimeter;
	}

	@Override
	public double getOriginDistance() {
		distance=Math.sqrt(x*x + y*y);
		return distance;
	}

	@Override
	public boolean isEnclosed(Point p) {
	 
	    double xMax=x+width;
		double yMax=y+width;
		
		if(p.x<=xMax && p.y<=yMax)
			return true;
			
		return false;
	}
}
