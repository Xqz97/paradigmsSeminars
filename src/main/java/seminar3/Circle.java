package seminar3;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double get_area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double get_perimeter() {
        return 2 * Math.PI * radius;
    }
}
