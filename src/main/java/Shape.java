
public abstract class Shape {

    private int numberOfSides;

    public Shape(int sides) {
        this.numberOfSides = sides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
