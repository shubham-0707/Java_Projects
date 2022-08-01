package Practice.Strings;
import java.util.*;


// Program to find the most frequent word in a string...
public class count_most_frequent {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        int maxi = Integer.MIN_VALUE;
        String ans = "";
        String string[] = str.split(" ");
        for(int i=0 ; i<string.length ; i++){
            String str1 = string[i];
            int count = 0;
            for(int j=i+1 ; j<string.length ; j++){
                if(str1.equals(string[j])){
                    count++;
                }
            }
            if(count>maxi){
                maxi = count;
                ans = string[i];
            }
        }

        System.out.println("The most frequent string is : "+ans);
    }
}
