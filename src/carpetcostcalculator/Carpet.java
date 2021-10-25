/* Program 17 continue...
2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
type double.
The class needs to have one constructor with parameter cost of type double and it needs to initialize
the field.
In case the cost parameter is less than 0 it needs to set the cost field value to 0.
Write the following methods (instance methods):
● Method named getCost without any parameters, it needs to return the value of cost field
 */

package carpetcostcalculator;

public class Carpet {

    double cost;

    // Constructor with one parameter with initialization
    public Carpet(double cost){

        // if condition to set cost value to 0.
        if(cost<0){
            this.cost=0;
        }else{
            this.cost=cost;
        }
    }

    // Instance variable with no parameters to return the cost value from Carpet constructor
    public double getCost(){

        return this.cost;
    }

}
