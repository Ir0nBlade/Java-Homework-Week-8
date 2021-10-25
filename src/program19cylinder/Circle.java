package program19cylinder;

public class Circle {

    double raduis;

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    public double getRadius() {
        return raduis;
    }

    public double getArea() {

        return raduis * raduis * Math.PI;
    }
}
