package QUEUE;

public class queue {
    private int arr[];
    private int front;
    private int size;

    public void Queue(){
        arr=new int[5];
    }
    public void Queue(int n){
        arr=new int[n];
    }
    public boolean isFull(){
        return size==arr.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("queue full hai");
        }
        int idx=(front+size)%arr.length;
        arr[idx] = item;
        size++;
    }

    public int Dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("queue Empty hai");
        }
        int v=arr[front];
        // front++;
        front=(front+1)%arr.length;
        size--;
        return v;
    }
    public int getFront() throws Exception{
        if (isEmpty()) {
            throw new Exception("queue full hai");
        }
        int v=arr[front];
        return v;
    }
    public void Display(){
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.println(arr[idx] + " ");

        }
System.out.println();
    }
}
