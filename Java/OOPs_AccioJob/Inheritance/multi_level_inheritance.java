package OOPs_AccioJob.Inheritance;


class X{
    public static int sum(int a , int b){
        return a+b;
    }
}

class Y extends X{
    public static int multiply(int a , int b){
        return a*b;
    }
}

class Z extends Y{

}

public class multi_level_inheritance {
    public static void main(String[] args) {
        Z prod = new Z();
        System.out.println("product is : "+ prod.multiply(3 , 5));

        Y add = new Y();

        System.out.println("Addition is : "+add.sum(5 , 8));


    }
}
