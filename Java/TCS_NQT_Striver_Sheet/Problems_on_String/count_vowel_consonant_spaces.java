/*

In this question we have to count the number of vowels , consonants and spaces...

 */



package TCS_NQT_Striver_Sheet.Problems_on_String;
import java.util.*;

public class count_vowel_consonant_spaces {

    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = 0;
        int consonant = 0;
        int spaces = 0;

        for(int i=0 ; i<str.length() ; i++){
            if(isVowel(str.charAt(i))){
                vowels++;
            }
            else if(isVowel(str.charAt(i))==false && ((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90) || ((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)){
                consonant++;
            }
            else if(str.charAt(i)==' '){
                spaces++;
            }
        }

        System.out.println("The total number of vowels are : "+vowels);
        System.out.println("The total number of consonants are : "+consonant);
        System.out.println("The total number of spaces are : "+spaces);


        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
