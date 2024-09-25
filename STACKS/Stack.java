package STACKS;

// public class Stack {
//     private int[] arr;
//     private int idx;

//     public Stack() {
//         arr = new int[5];
//     }

//     public Stack(int n) {
//         arr = new int[n];
//     }

//     public boolean isEmpty() {
//         return idx == 0;
//     }

//     public void push(int item) {
//         arr[idx] = item;
//         idx++;
//     }

//     public boolean isfull() {
//         return arr.length == idx;
//     }

//     public int size() {
//         return idx;
//     }

//     public int pop() {
//         idx--;
//         return arr[idx];
//     }

//     public int peek() {
//         return arr[idx - 1];
//     }

//     public void Display() {
//         for (int i = 0; i < idx; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }package stack_queue;

public class Stack {
    private int arr[];
    private int idx;

    public Stack(){
        arr=new int[5];
    }
    public Stack(int n){
        arr=new int[n];
    }
    public boolean isEmpty(){
        return idx==0;
    }
    public boolean isfull(){
        return arr.length==idx;
    }
    public int size(){
        return idx;
    }
    public void push(int item) throws Exception{
        if (isfull()) {
            throw new Exception("stack full");
        }
        arr[idx]=item;
        idx++;
    }

    public int pop()throws Exception {
        if (isEmpty()) {
            throw new Exception("stack full");
        }
        idx--;
        return arr[idx];
    }

    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("stack full");
        }
        return arr[idx-1];
    }

    public void Display() {
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    

}
