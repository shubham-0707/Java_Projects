/*

...Rat in a maze problem...

 */


package Practice.Recursion;
import java.util.*;

public class rat_in_a_maze_problem {

    public static void solve(int i , int j , int[][] arr , int[][] visited , ArrayList<String> ans , String move){
        if(i==arr.length-1 && j==arr.length-1){
            ans.add(move);
            return;
        }

        // downward
        if(i+1<arr.length && arr[i+1][j]==1 && visited[i+1][j]==0){
            visited[i][j] = 1;
            solve(i+1 , j , arr , visited , ans , move+'D');
            visited[i][j]=0;
        }

        //left
        if(j-1>=0 && arr[i][j-1]==1 && visited[i][j-1]==0){
            visited[i][j]=1;
            solve(i , j-1 , arr , visited , ans , move+'L');
            visited[i][j]=0;
        }

        //right
        if(j+1<arr.length && arr[i][j+1]==1 && visited[i][j+1]==0){
            visited[i][j]=1;
            solve(i ,j+1 , arr , visited , ans , move+'R');
            visited[i][j]=0;
        }

        //upwards
        if(i-1>=0 && arr[i-1][j]==1 && visited[i-1][j]==0){
            visited[i][j]=1;
            solve(i-1 , j , arr , visited , ans , move+'U');
            visited[i][j]=0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        // declaring and initialising the array..
        int[][] arr = new int[n][n];
        int[][] visited = new int[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0  ; j<n ; j++){
                arr[i][j] = sc.nextInt();
                visited[i][j] = 0;
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        if(arr[0][0]==1){
            solve(0 , 0 , arr , visited , ans , "");
        }

        if(ans.size()==0){
            System.out.println("-1");
            return;
        }

        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }


    }
}
