
public class Square extends Shape {

    private double side;

    public Square(double side) {
        super(4);

        if (side <= 0 || !Double.isFinite(side)) {
            throw new IllegalArgumentException("Side must be positive.");
        }

        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
