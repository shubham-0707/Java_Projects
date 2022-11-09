package Backend_Module.OOPs;


class RWOnly{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

public class Question_4 {
    public static void main(String[] args) {
        RWOnly  rw = new RWOnly();
        rw.setName("Shubham Singh");
        System.out.println("Name is : "+rw.getName());
    }
}
