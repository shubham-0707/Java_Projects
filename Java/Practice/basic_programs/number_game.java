package Practice.basic_programs;
import java.util.*;


// In this question the main aim is to make the sum of the digits of a less than b ...
public class number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int minSteps=0;
        int prod = 1;

        if(a<=b){
            System.out.println("0");
            return;
        }
        else{
            int factor = 0;
            String strA = Integer.toString(a);
            String strB = Integer.toString(b);
            if(strA.charAt(0)>=strB.charAt(0) && strB.length()==1){
                factor = strA.length();
            }
            else{
                factor = strA.length()-1;
            }

            if(factor==strA.length()){
                prod = prod * (int)Math.pow(10 , factor);
            }
            else{
                int first = Character.getNumericValue(strA.charAt(0)) +1;
                prod = prod * first * (int)Math.pow(10 , factor);
            }
        }

        minSteps = prod - a;
        System.out.println(minSteps);

    }
}

