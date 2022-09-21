/**
 * Polymorphism
 *
 * Task 1:
 * create a class Product
 *
 * Task 2:
 * create object of Product in Main function called p
 *
 * Task 3:
 * create a method of following defination
 * public int product(int x, int y) {}
 *
 * call this method from Main using Product class object p
 *
 * Task 4:
 * create a Overloaded method product of following defination
 * public int product(int x, int y, int z) {}
 *
 * call this method also from Main using Product class object p
 *
 * Task 5:
 * create a Overloaded method product of following defination
 * public double product(double x, double y) {}
 *
 * call this method also from Main using Product class object p
 *
 * Observations:
 * This class contains 3 classes with same name, but it complie & run successfully
 *
 */



package OOPs_AccioJob.Polymorphism;


class Product{
    public int product(int x , int y){
        return x*y;
    }

    public int product(int x , int y , int z){
        return x*y*z;
    }

    public double product(double x , double y){
        return x*y;
    }
}

public class polymorphism {
    public static void main(String[] args) {

        Product p = new Product();

        System.out.println("Product of two numbers : "+p.product(2 , 5));
        System.out.println("Product of 3 numbers : "+p.product(2 , 5 , 9));
        System.out.println("Product of doubles : "+p.product(3.6 , 7.8));

    }
}
