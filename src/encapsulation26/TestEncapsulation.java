package encapsulation26;

public class TestEncapsulation {

    public static void main(String[] args) {

        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        //Displaying values of the variable
        System.out.println("Prime's name: "+obj.getName());
        System.out.println("Prime's age: "+obj.getAge());
        System.out.println("Prime's rollNo: "+obj.getRollNo());
    }


}
