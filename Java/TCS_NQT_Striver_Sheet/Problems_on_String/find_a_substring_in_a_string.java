/*
...Find out a substring in a string...
 */

package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class find_a_substring_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the substring to be searched : ");
        String str2 = sc.nextLine();

        int idx = -1;
        for(int i=0 ; i<str1.length()-str2.length()+1 ; i++){
            String temp = str1.substring(i , i+str2.length());
            if(temp.equals(str2)){
                idx = i;
                break;
            }
        }

        if(idx!=-1){
            System.out.println("The substring is found at index : "+idx);
            return;
        }
        System.out.println("The substring is not found !");
    }
}
