package Practice.basic_programs;
import java.util.*;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int result = n;
        String str = Integer.toString(n);
        int len = str.length();


        double sum = 0;
        while(n>0){
            int res = n%10;
            sum = sum+ Math.pow(res , len);
            n=n/10;
        }

        if(sum==result){
            System.out.println("The number is an armstrong number");
        }
        else{
            System.out.println("The number is not an armstrong number");
        }
    }

}
