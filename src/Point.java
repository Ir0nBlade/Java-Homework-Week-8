/*
16. Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters x and y of type int and it needs to initialize the
fields.
Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance
between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.

TEST EXAMPLE
→ TEST CODE: Write the below code into the main method.
Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());
OUTPUT
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0
NOTE: Use Math.sqrt to calculate the square root √.
NOTE: Try to avoid duplicated code.
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 7 methods.
 */

public class Point {

    int x, y;

    // First constructor without args.
    public Point() {

    }

    // Second constructor with args.
    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    // getX isntance method without any paramenters
    public int getX() {
        return x;
    }

    // gety isntance method without any paramenters
    public int getY() {
        return y;
    }
    // setX isntance method with one paramenter
    public int setX(int x) {
        return x;
    }

    // setY isntance method with one paramenter
    public int setY(int y) {
        return y;
    }

    /*distance method without parameter with double return type
    to calculate distance between two points
    */
    public double distance() {

        return Math.sqrt((x * x) + (y * y));
    }

    /*distance method with two parameter with double return type
    to calculate distance between two points
    */
    public double distance(int x, int y) {

        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    /*distance method with parameter with double return type
        to calculate distance between two points
        */
    public double distance(Point point) {
        return Math.sqrt((this.x - point.getX()) * (this.x - point.getX()) +
                (this.y - point.getY()) * (this.y - point.getY()));
    }

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

}
