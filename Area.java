public class Area {
	
	static double area;
	static final double pi=3.14;

	/*
	 * this method returns the area of triangle 
	 * @param height of triangle
	 * @param width of triangle
	 * @return area of triangle
	 */
	public static double triangleArea(double height, double width) {
		
		area=(height*width)/2;
		return area;
	}

	/*
	 * this method returns the area of rectangle 
	 * @param height of rectangle
	 * @param width of rectangle
	 * @return area of rectangle
	 */
	public static double rectangleArea(double height, double width) {
		
		area=height*width;
		return area;
	}

	/*
	 * this method returns the area of square 
	 * @param width of square
	 * @return area of square
	 */
	public static double squareArea(double width) {
		
		area=width*width;
		return area;
	}

	/*
	 * this method returns the area of circle 
	 * @param radius of circle
	 * @return area of circle
	 */
	public static double circleArea(double radius) {
		
		area=pi*radius*radius;
		return area;
	}

}
