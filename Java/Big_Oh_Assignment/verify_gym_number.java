package Big_Oh_Assignment;
import java.util.*;

public class verify_gym_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)<48 || str.charAt(i)>57){
                System.out.println("no");
                return;
            }
        }

        if(str.length()==17){
            if((str.charAt(5)==':' || str.charAt(5)=='-' ||  str.charAt(5)=='/') && (str.charAt(11)==':' || str.charAt(11)=='/' || str.charAt(11)=='-')){
                if(str.charAt(0)=='5' || str.startsWith("37") || str.charAt(0)=='4'){
                    System.out.println("yes");
                    return;
                }
            }
        }
        System.out.println("no");
    }
}
