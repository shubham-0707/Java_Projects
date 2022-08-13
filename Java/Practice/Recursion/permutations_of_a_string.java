

/*

Permutations of a string...

 */


package Practice.Recursion;
import java.util.*;

public class permutations_of_a_string {

    public static void recurPermute(int index , String str  , ArrayList<String> ans){
        if(index==str.length()){
            ans.add(str);
            return;
        }

        for(int i=index ; i<str.length() ; i++){
            swap(i , index , str);
            recurPermute(index+1 , str , ans);
            swap(i , index , str);
        }
    }

    public static void swap(int start , int end , String str){

        char[] ch = str.toCharArray();

        char temp = ch[start];
        ch[start]=ch[end];
        ch[end] = temp;

        str = String.valueOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "123";
        ArrayList<String> ans = new ArrayList<>();

        recurPermute(0 , str , ans);

        for(int i=0 ; i<ans.size() ; i++){
            System.out.println(ans.get(i)+" ");
        }

    }
}
