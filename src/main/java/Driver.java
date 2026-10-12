
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(5));
        shapes.add(new Circle(3));
        shapes.add(new Triangle(3, 4, 5));

        for (Shape shape : shapes) {
            System.out.println(
                    "Shape: " + shape.getClass().getSimpleName()
            );

            System.out.println(
                    "Number of sides: " + shape.getNumberOfSides()
            );

            System.out.printf("Area: %.2f%n", shape.getArea());

            System.out.printf(
                    "Perimeter: %.2f%n",
                    shape.getPerimeter()
            );

            System.out.println();
        }
    }
}
