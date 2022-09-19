package Practice.Arrays;
import java.util.*;

public class find_unique_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0 ; i<n ; i++){
            set.add(arr[i]);
        }

        int x = 0;
        for(int i : set){
            if(i%2==0){
                System.out.println("index: "+x+" element : "+i);
            }
            else{
                System.out.println("index: "+x+" element : "+i);
            }
            x++;
        }


    }
}
