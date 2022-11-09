package Backend_Module.OOPs;


class A{
    public void meth(){
        System.out.println("Calling method of class A");
    }
}

class B extends A{
    public void meth(){
        System.out.println("Calling method of class B");
    }
}

public class Question_5 {
    public static void main(String[] args) {
        B b = new B();
        b.meth();
    }
}

/*
This question is the perfect example of the overriding in the OOPs...
 */
