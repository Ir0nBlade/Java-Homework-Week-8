/* 17. Carpet Cost Calculator
The Carpet Company has asked you to write an application that calculates the price of carpeting for
rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10
meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
would cost $960.
1. Write a class with the name Floor. The class needs two fields (instance variables) with name width
and length of type double.
The class needs to have one constructor with parameters width and length of type double and it
needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length
parameter is less than 0 it needs to set the length field value to 0.
Write the following methods (instance methods):
● Method named getArea without any parameters, it needs to return the calculated area
(width * length).
 */

package carpetcostcalculator;

public class Floor {

    // two instance variables with both values set to zero
    double length = 0;
    double width = 0;

    // Constructor with two args with initialization
    public Floor(double length, double width) {

        this.length = length;
        this.width = width;
    }

    // Instance method to calculate the area
    public double getArea() {

        double area = this.length * this.width;
        return area;
    }

}
