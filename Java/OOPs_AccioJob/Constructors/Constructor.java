/**
 * Constructors
 *
 * Task 1:
 * create a class Student
 *
 * Task 2:
 * create a default constructor for class Student
 *
 * Print following statement in this constructor:
 * System.out.println("Default Constructor is called!");
 *
 * Task 3:
 * Invoke default constructor from main, by creating an object of class Student named as student1
 *
 * Task 4:
 * Now, create a parameterized constructor for class Student with 2 parameters: firstName & lastName
 *
 * Print following statement in this constructor:
 * System.out.println("Constructor with 2 arguments, firstName: " + firstName + " and Lastname: " + lastName + " & rollNumber: " + rollNumber +" was called");
 *
 * Task 5:
 * Invoke this 2 parameter, parameterized constructor from main, by creating an object of class Student named as student2
 *
 * Task 6:
 * Now, lets try something advanced!
 * lets try doing constructor overloading, just like with methods done earlier
 *
 * Now, create a parameterized constructor for class Student with 3 parameters: firstName, lastName and rollNumber
 *
 * Print following statement in this constructor:
 * System.out.println("Constructor with 3 arguments, firstName: " + firstName + ", Lastname: " + lastName + " was called");
 *
 * Task 7:
 * Invoke this 3 parameter, parameterized constructor from main, by creating an object of class Student named as student3
 *
 * Observations:
 * This class conatains 3 constructor:
 * one default
 * and two parameterized
 *
 * We also observe that we can do constructor overloading like earlier done with methods in Polymorphism
 */


package OOPs_AccioJob.Constructors;

class Student{
    Student(){
        System.out.println("Default Constructor is called !");
    }

    Student(String first , String last){
        System.out.println("First name is : "+first+"\nSecond name is : "+last);
    }

    Student(String first , String last , int roll_no){
        System.out.println("First name is : "+first+"\nsecond name is : "+last+"\nRoll Number is : "+roll_no);
    }

}

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Shubham" , "Singh");
        Student student3 = new Student("Shubham" , "Singh" , 103);

    }
}
