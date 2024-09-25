package CYCLE_IN_THE_LINKEDLIST;
// public class LinkedList {
//     class Node {
//         int val;
//         Node Next;
//     }

//     private Node head;
//     private Node tail;
//     private int size;

//     public void addFirst(int item) {
//         Node nn = new Node();
//         nn.val = item;
//         if (size == 0) {
//             head = nn;
//             tail = nn;
//             size++;
//         } else {
//             nn.Next = head;
//             head = nn;
//             size++;
//         }

//     }

//     public void addLast(int item) {
//         if (size == 0) {
//             addFirst(item);
//         } else {
//             Node nn = new Node();
//             nn.val = item;
//             tail.Next = nn;
//             size++;
//         }
//     }

//     public void addindex(int k, int item) throws Exception {
//         if (k == 0) {
//             addFirst(item);
//         } else if (k == size) {
//             addLast(item);
//         } else {
//             Node nn = new Node();
//             nn.val = item;
//             Node k_1th = GetNode(k - 1);
//             nn.Next = k_1th.Next;
//             k_1th.Next = nn;
//             size++;

//         }
//     }

//     public int getFirst() {
//         return head.val;
//     }

//     public int getlast() {
//         return tail.val;
//     }

//     public int getatindex(int k) throws Exception {
//         return GetNode(k).val;
//     }

//     public int removefirst() {
//         Node temp = head;
//         if (size == 1) {
//             head = null;
//             tail = null;
//             size--;
//         } else {
//             head = head.Next;
//             temp.Next = null;
//             size--;
//         }
//         return temp.val;
//     }

//     public int removeLast() throws Exception {
//         if (size == 1) {
//             return removefirst();
//         } else {
//             Node temp = GetNode(size - 2);
//             temp.Next = null;
//             int val = tail.val;
//             tail = temp;
//             size--;
//             return val;
//         }

//     }

//     public int removeatindex(int k) throws Exception {
//         if (k == 0) {
//             return removefirst();
//         }
//         else if (k == size - 1) {
//             return removeLast();
//         }
//         else {
//             Node curr = GetNode(k);
//             Node prev = GetNode(k - 1);
//             prev.Next = curr;
//             curr.Next = null;
//             size--;
//             return curr.val;
//         }
//     }
//     public Node GetNode(int k) throws Exception {
//         if (k < 0 || k >= size) {
//             throw new Exception("bhai k range m dede");
//         }
//         Node temp = head;
//         for (int i = 0; i < k; i++) {
//             temp = temp.Next;
//         }
//         return temp;
//     }

//     public void Display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + "-->");
//             temp = temp.Next;
//         }
//         System.out.print("null");
//     }

//     public void createCycle() throws Exception {
//         Node nn = GetNode(2);
//         tail.Next = nn;

//     }
    
//     public static void main(String[] args) throws Ex {
//         LinkedList cl = new LinkedList();
//         cl.addLast(10);
//         cl.addLast(20);
//         cl.addLast(30);
//         cl.addLast(40);
//         cl.addLast(50);
//         cl.addLast(60);
//         cl.addLast(70);
//         cl.addLast(80);
//         cl.createCycle();
//         cl.Display();
//     }

// }


// import java.sql.SQLOutput;

public class LinkedList {
    class Node{
        int val;
        Node Next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item){
        Node nn = new Node();
        nn.val = item;
        if(size==0){
            head = nn;
            tail = nn;
            size++;
        }
        else{
            nn.Next = head;
            head = nn;
            size++;
        }

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"-->");
            temp = temp.Next ;
        }
        System.out.println(".");
    }
    public void addLast(int item){
        if(size == 0){
            addFirst(item);
        }
        else{
            Node nn = new Node();
            nn.val = item;
            tail.Next = nn;
            tail = nn;
            size++;
        }
    }
    public void addatIndex(int k , int item) throws  Exception{
        if(k==0){
            addFirst(item);
        } else if (k==size) {
            addLast(item);
        }
        else{
            Node nn = new Node();
            nn.val = item;
            Node k_1th = getNode(k - 1);
            nn.Next = k_1th.Next;
            k_1th.Next = nn;
            size++;

        }
    }
    private Node getNode(int index) throws  Exception{
        if(index<0||index>=size){
            throw new Exception("Bklol k range me do");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.Next;
        }
        return temp;
    }
    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int getAtIndex(int k) throws  Exception{
        return getNode(k).val;
    }
    public int deleteFirst(){

        Node temp = head;
        if(size == 1){
            head = null;
            tail = null;
            size--;
        }
        int val = temp.val;
        head = head.Next;
        temp.Next = null;
        size--;
        return val;
    }
    public int deleteLast() throws Exception{
        if(size == 1){
            return deleteFirst();
        }
        else{
            Node temp = getNode(size-2);
            int ele = tail.val;
            tail = temp;
            temp.Next = null;
            size--;
            return ele;
        }
    }
    public int deleteAtIndex(int k) throws Exception{
        if(k==0){
            return deleteFirst();
        } else if (k==size-1) {
            return deleteLast();
        } else{
            Node curr  = getNode(k);
            Node prev = getNode(k-1);
            prev.Next = curr.Next;
            curr.Next=null;
            return curr.val;

        }

    }
    public void create_cycle() throws Exception {
        Node nn = getNode(2);
        tail.Next = nn;

    }

    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.addLast(80);
        ll.addLast(90);
        ll.addLast(100);
        ll.addLast(110);
        ll.create_cycle();
        ll.display();

    }

    public Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public void Removecycle1() {
        Node meet = hasCycle();
        if (meet == null) {
            return;
        }
        Node start = head;
        while (start != null) {
            Node temp = meet;
            while (temp.Next != meet) {
                if (temp.Next == start) {
                    temp.Next = null;
                    return;
                }
                temp = temp.Next;
            }
            start = start.Next;
        }

    }

    public void Removecycle2() {
        Node meet = hasCycle(head);
        if (meet == null) {
            return;
        }
        int c = 1;
        Node temp = meet;
        while (temp.Next != meet) {
            c++;
            temp = temp.Next;
        }

        Node fast = head;
        for (int i = 0; i < c; i++) {
            fast = fast.Next;
        }
        Node slow = head;
        while (slow.Next != fast.Next) {
            slow = slow.Next;
            fast = fast.Next;
        }
        fast.Next = null;
    }

    public void floyedcycle() {
        Node meet = hasCycle();
        if (meet == null) {
            return;
        }
        Node fast = meet;
        Node slow = head;
        while (slow.Next != fast.Next) {
            slow = slow.Next;
            fast = fast.Next;
        }
        fast.Next = null;
        }
}