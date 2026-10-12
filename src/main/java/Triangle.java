
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super(3);

        if (!Double.isFinite(a) ||
                !Double.isFinite(b) ||
                !Double.isFinite(c) ||
                a <= 0 || b <= 0 || c <= 0 ||
                a + b <= c ||
                a + c <= b ||
                b + c <= a) {

            throw new IllegalArgumentException(
                    "Invalid triangle side lengths."
            );
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2.0;

        return Math.sqrt(
                s * (s - a) * (s - b) * (s - c)
        );
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
