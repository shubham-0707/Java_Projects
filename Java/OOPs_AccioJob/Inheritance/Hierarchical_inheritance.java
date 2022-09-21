package OOPs_AccioJob.Inheritance;


class P{
    P(){
        System.out.println("P class's default constructor is called");
    }
}

class Q extends P{
    Q(){
        System.out.println("");
    }
}

class R extends P{
    R(){
        System.out.println("");
    }
}

class S extends P{
    S(){
        System.out.println("");
    }
}

public class Hierarchical_inheritance {
    public static void main(String[] args) {

        Q q = new Q();
        R r = new R();
        S s = new S();

        System.out.println("Called from Q : "+q);
        System.out.println("Called from R : "+r);
        System.out.println("Called from S : "+s);
    }
}
