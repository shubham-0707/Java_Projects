package Practice.Recursion;
import java.util.*;


// This program is made to print all the subsequences of an array...
class SubSequences{
    public static void subsequences(int[] arr , ArrayList<Integer> temp , int i , int n){
        if(i>=n){
            for(int v:temp){
                System.out.print(v+" ");
            }
            if(temp.size()==0){
                System.out.print("Null");
            }
            System.out.println();
            return;
        }

        temp.add(arr[i]);
        subsequences(arr , temp , i+1 , n);
        temp.remove(temp.size()-1);
        subsequences(arr , temp , i+1 , n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        subsequences(arr , temp , 0 , n);

    }
}