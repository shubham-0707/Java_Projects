/**
 * Methode Overriding
 *
 * Task 1:
 * create a class A, with a method named meth having a print statement
 * System.out.println("Invoking methode from class A");
 *
 * Task 2:
 * create a class B which extends class A
 *
 * Task 3:
 * create object of class B and call methode `meth` of class A with it
 *
 * Task 4:
 * Now override methode `meth` of class A in class B, which prints following statement
 * System.out.println("Methode is overridden in Extendend class B");
 *
 * Task 5:
 * call this overridden methode from obj of class B
 */


package OOPs_AccioJob.OverRiding;


class A{
    public void meth(){
        System.out.println("Invoking method from class A");
    }
}

class B extends A{
    public void meth(){
        System.out.println("Invoking methode from class B");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        B b = new B();
        b.meth();
    }
}
