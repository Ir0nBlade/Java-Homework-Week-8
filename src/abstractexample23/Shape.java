/*
21. Understanding the real scenario of Abstract class (Create package name
‘abstractexample23’ and create all below classes in this package)
1. Create below Shape class which is abstract
abstract class Shape{
public abstract void draw();
}
2. Create a second class name Rectangle which extends by Shape.
class Rectangle extends Shape{
public void draw(){System.out.println("drawing rectangle");}
}
3. Create a Third class name Circle1 which extends by Shape.
class Circle1 extends Shape{
public void draw(){System.out.println("drawing circle");}
}
4. Create the fourth class name TestAbstraction1 and inside create the
main method as below.
//In real scenario, method is called by programmer or user
class TestAbstraction1{
public static void main(String args[]){
Shape s=new Circle1();//In a real scenario, object is provided through
method, e.g., getShape() method
s.draw();
}
}
 */

package abstractexample23;

abstract class Shape {

    public abstract void draw();

}
