package Java_Problems.Java.com.example.Arrays;
import java.util.*;


/* This program is made to sort a string array but the condition is that the first character
 should either be in lower case or in upper case of each element of the array…*/
public class sort_string_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        String[] str = new String[n];
        System.out.println("Enter elements : ");
        for(int i=0 ; i<n ; i++){
            str[i] = sc.next();
        }

        Arrays.sort(str);

        System.out.println("Sorted array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(str[i]+" ");
        }

    }
}

