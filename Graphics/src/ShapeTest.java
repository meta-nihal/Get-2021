import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ShapeTest {
	
	List<Integer> list;
	@Test
    public void testAddShape1() {
        Screen screen = new  Screen().getInstance();
        list = new ArrayList<>();
        list.add(1);
        Boolean result = screen.addShape(new Circle((new Point(2.0, 2.0)),list));
        assertTrue(result);
    }

    // Test for adding rectangle to screen
    @Test
    public void testAddShape2() {
        Screen screen = new Screen().getInstance();
        list = new ArrayList<>();
        list.add(6);
        list.add(4);
        Boolean result = screen.addShape(new Rectangle( new Point(10, 10), list));
        assertTrue(result);
    }

    // Test for adding triangle to screen
    @Test
    public void testAddShape3()  {
        Screen screen = new Screen().getInstance();
        list = new ArrayList<>();
        list.add(6);
        list.add(4);
        Boolean result = screen.addShape(new Triangle( new Point(10, 10),list));
        assertTrue(result);
    }

    // Test for adding square to screen
    @Test
    public void testAddShape4() {
        Screen screen = new Screen().getInstance();
        list = new ArrayList<>();
        list.add(4);
        Boolean result = screen.addShape(new Square(new Point(0, 0),list));
        assertTrue(result);
    }

    // Test for deleting a shape
    @Test
    public void testDeleteShape()  {
        Screen screen = new Screen().getInstance();
        list = new ArrayList<>();
        list.add(6);
        list.add(4);
        screen.addShape(new Rectangle(new Point(10,10), list));
        Boolean result = screen.deleteShape(new Rectangle( new Point(0, 0),list));
        assertTrue(result);

    }

    // Test for deleting all shapes of a type.
    @Test
    public void testAllDeleteShape()  {
        Screen screen = new Screen().getInstance();
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(8);
        List<Integer> list3= new ArrayList<>();
        list3.add(4);
        list3.add(2);
        screen.addShape(new Rectangle(new Point(10,10), list1));
        screen.addShape(new Rectangle(new Point(10,10), list2));
        screen.addShape(new Triangle( new Point(10,10),list3));

        Boolean result = screen.deleteAllShape();
        assertTrue(result);
    }

    
    @SuppressWarnings("serial")
    @Test
    public void testAscendingInArea() {
        Screen screen = new Screen();
        Shape shape1 = ShapeFactory.createShape("rectangle",
                new Point(1, 1), new ArrayList<Integer>() {
                    {
                        add(4);
                        add(2);
                    }
                });
        

        screen.addShape(shape1);
        Shape shape2 = ShapeFactory.createShape("square",
                new Point(1, 1), new ArrayList<Integer>() {
                    {
                        add(2);
                    }
                });
        screen.addShape(shape2);
        List<Shape> sortedShapeByArea = screen.sortByArea();
        assertEquals(sortedShapeByArea, new ArrayList<Shape>() {
            {
                add(shape2);
                add(shape1);
            }
        });
    }
    
    @SuppressWarnings("serial")
    @Test
    public void testAscendingInPerimeter() {
        Screen screen = new Screen();
        Shape shape1 = ShapeFactory.createShape("rectangle",
                new Point(1, 1), new ArrayList<Integer>() {
                    {
                        add(4);
                        add(2);
                    }
                });
        

        screen.addShape(shape1);
        Shape shape2 = ShapeFactory.createShape("square",
                new Point(1, 1), new ArrayList<Integer>() {
                    {
                        add(2);
                    }
                });
        screen.addShape(shape2);
        List<Shape> sortedShapeByPerimeter = screen.sortByParimeter();
        assertEquals(sortedShapeByPerimeter, new ArrayList<Shape>() {
            {
                add(shape2);
                add(shape1);
            }
        });
    }
    
    @SuppressWarnings("serial")
    @Test
    public void testAscendingInOriginDistance() {
        Screen screen = new Screen();
        Shape shape1 = ShapeFactory.createShape("rectangle",
                new Point(1, 1), new ArrayList<Integer>() {
                    {
                        add(4);
                        add(2);
                    }
                });
        

        screen.addShape(shape1);
        Shape shape2 = ShapeFactory.createShape("square",
                new Point(1, 1), new ArrayList<Integer>() {
                    {
                        add(2);
                    }
                });
        screen.addShape(shape2);
        List<Shape> sortedShapeByOriginDistance = screen.sortByOriginDistance();
        assertEquals(sortedShapeByOriginDistance, new ArrayList<Shape>() {
            {
                add(shape2);
                add(shape1);
            }
        });
    }    
}
