package Backend_Module.OOPs;


class Namaste{
    Namaste(){
        System.out.println("The default constructor is saying 'Namaste' ");
    }

    Namaste(String x){
        this();
        System.out.println("Namaste from "+x);
    }

    Namaste(String x , String y){
        this();
        System.out.println("Namaste from "+x+" to "+y);
    }

}
public class Question_1 {
    public static void main(String[] args) {
        Namaste n  = new Namaste();

    }
}
