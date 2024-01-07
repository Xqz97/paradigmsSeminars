package seminar3;

public class Triangle extends Shape {
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Override
    public double get_area() {
        double p = (a + b + c) / 2;
        return Math.sqrt((p*(p-a)*(p-b)*(p-c)));
    }

    @Override
    public double get_perimeter() {
        return a + b + c;
    }
}
