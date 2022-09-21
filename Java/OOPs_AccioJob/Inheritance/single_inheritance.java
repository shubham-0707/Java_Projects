/**
 * Inheritance
 *
 * Task 1:
 * Implement Single Inheritance,
 *
 * Having one parent class and one child class
 *
 *
 * Task 2:
 * Implement Multilevel Inheritance,
 *
 * Having Three classes one after other as a multilevel structure
 *
 *
 * Task 3:
 * Implement Hierarchical Inheritance,
 *
 * Having a parent class A, and three childrens of class A, as Class B, C, D
 */



package OOPs_AccioJob.Inheritance;

class A{
    public static int sum(int a , int b){
        return a+b;
    }
}

class B extends A{

}

public class single_inheritance {

    public static void main(String[] args) {
        B b = new B();
        System.out.println("Sum is : "+b.sum(2 , 4));
    }

}
