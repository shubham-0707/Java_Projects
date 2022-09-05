package Big_Oh_Assignment;
import java.util.*;

public class Main{

    public static void main(String[] args) {

        Vehicle bike1 = new Vehicle("Ducati" , "2-wheeler" , "Petrol" , "imported" , "used");

        Vehicle car1 = new Vehicle("Honda Accord" , "4-wheeler" , "Diesel" , "not imported" , "new");


        //printing bike details...
        System.out.println("---------------------Ducati-------------------");
        System.out.println("Name of the bike: "+bike1.getName());
        System.out.println("Structure of the vehicle : "+bike1.getStructure());
        System.out.println("Fuel Used : "+bike1.getFuel_type());
        System.out.println("Is vehicle imported ? "+bike1.getImp_or_not());
        System.out.println("Is vehicle used ? "+bike1.getNew_or_used());
        System.out.println("------------------------------------------------");


        // printing the car details...

        System.out.println("------------------------Honda Accord---------------");
        System.out.println("Namwe of the car : "+car1.getName());
        System.out.println("Structure of the vehicle : "+car1.getStructure());
        System.out.println("Fuel used : "+car1.getFuel_type());
        System.out.println("Is vehicle imported ? : "+car1.getImp_or_not());
        System.out.println("Is vehicle used ? : "+car1.getNew_or_used());
        System.out.println("----------------------------------------");
    }
} 
