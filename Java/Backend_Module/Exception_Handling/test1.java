package Backend_Module.Exception_Handling;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3 , 4};
        try{
            for(int i=1 ; i<=4 ; i++){
                System.out.println(arr[i]+" ");
            }
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }

    }
}
