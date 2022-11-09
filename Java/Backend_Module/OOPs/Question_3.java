package Backend_Module.OOPs;


class Student{
    Student(){
        System.out.println("Default constructor is called");
    }

    Student(String firstName , String lastName){
        System.out.println("Parameterised constructor is called with firstName = "+firstName+ " and "+"lastName : "+lastName);
    }

    Student(String firstName , String lastName , int rollNo){
        System.out.println("Parametrised constructor is called with firstName : "+firstName+" lastName : "+lastName+" and rollNo is : "+rollNo);
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Shubham" , "Singh");
        Student student3 = new Student("Shubham" , "Singh" , 103);

    }
}
