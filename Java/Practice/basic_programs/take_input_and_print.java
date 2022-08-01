package Practice.basic_programs;
import java.util.*;

public class take_input_and_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name , father_name;

        System.out.print("Enter your name : " );
        name = sc.nextLine();
        System.out.print("Enter your father's name : ");
        father_name = sc.nextLine();

        // Printing the value of the name and the father's name :

        System.out.println("Name is : "+name);
        System.out.println("The father's name is : "+father_name);

    }
}
