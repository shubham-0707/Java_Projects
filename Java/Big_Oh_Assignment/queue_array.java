package Big_Oh_Assignment;

public class queue_array {
    static int front = -1;
    static int back = -1;

    static int[] queue = new int[100];

    public static void add(int val){
        back++;
        if(back==0)front=0;
        queue[back] = val;
    }

    public static int front(){
        if(front==-1 || back==-1 || front>back){
            System.out.println("The queue is already empty");
            return -1;
        }
        System.out.println(queue[front]);
        return 0;
    }

    public static int poll(){
        if(front>back){
            System.out.println("The queue is already empty");
            return -1;
        }
        System.out.println(queue[front]);
        front++;
        return 0;
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        poll();
        front();
        add(50);
        add(79);
        poll();
        front();
        add(23);
        poll();
        front();
        poll();
        poll();
        front();

    }
}
