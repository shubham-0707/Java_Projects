package Backend_Module.OOPs;

class Parent{
    Parent(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("This is child class");
    }
}

public class Question_7 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
    }
}

/*
This question is the perfect example of the single level inheritance...
 */
