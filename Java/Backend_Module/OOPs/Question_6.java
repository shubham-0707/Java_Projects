package Backend_Module.OOPs;


class Product{
    int product(int x , int y){
        return x*y;
    }

    int product(int x , int y , int z){
        return x*y*z;
    }

    double product(double x , double y){
        return x*y;
    }
}
public class Question_6 {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("The product of two integers is : "+p.product(5 , 3));
        System.out.println("The product of three integers is : "+p.product(5 , 3 , 8));
        System.out.println("The product of two doubles is : "+p.product(3.44  , 6.77));
    }
}

/*
This question is the perfect example of the polymorphism...
 */
