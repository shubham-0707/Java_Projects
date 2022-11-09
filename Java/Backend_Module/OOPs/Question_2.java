package Backend_Module.OOPs;


class Derived extends Base{
    Derived(){
        super();
        System.out.println("Calling Default constructor of Derived Class");
    }

    Derived(int x){
        super(x);
        System.out.println("Calling derived class constructor with x equals to "+x);
    }
}

class Base{
    Base(){
        System.out.println("Calling default constructor of Base class");
    }

    Base(int x){
        this();
        System.out.println("Calling parametrised constructor of base class with x equal to "+x);
    }

}

public class Question_2 {
    public static void main(String[] args) {
        Derived der = new Derived(5);
    }

/*
from the example of this question it is clear that if we use super keyword without argument then it calls the default constructor of the base class
but when we use the super keyword with some argument then it invokes the parametrised constructor of the parent class...
 */

}
