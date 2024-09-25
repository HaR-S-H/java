package QUEUE;

// import javax.management.Query;

public class queue_client {
    public static void main(String[] args) throws Exception{
        queue q = new queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Enqueue(60);
        q.Display();
    }
}
