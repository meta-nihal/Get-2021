
public interface Shape {
  double getArea();
  double getPerimeter();
  double getOriginDistance();
  boolean isEnclosed(Point p);
 enum shapeType{circle,rectangle,square,traingle};
}
