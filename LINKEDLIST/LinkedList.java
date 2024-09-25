package LINKEDLIST;

public class LinkedList {
        class Node {
            int val;
            Node Next;
        }
    
        private Node head;
        private Node tail;
        private int size;
    
        public void addFirst(int item) {
            Node nn = new Node();
            nn.val = item;
            if (size == 0) {
                head = nn;
                tail = nn;
                size++;
            } else {
                nn.Next = head;
                head = nn;
                size++;
            }

        }

        public void addLast(int item) {
            if (size == 0) {
                addFirst(item);
            } else {
                Node nn = new Node();
                nn.val = item;
                tail.Next = nn;
                size++;
            }
        }

        public void addindex(int k, int item) throws Exception {
            if (k == 0) {
                addFirst(item);
            } else if (k == size) {
                addLast(item);
            } else {
                Node nn = new Node();
                nn.val = item;
                Node k_1th = GetNode(k - 1);
                nn.Next = k_1th.Next;
                k_1th.Next = nn;
                size++;

            }
        }

        public int getFirst() {
            return head.val;
        }

        public int getlast() {
            return tail.val;
        }

        public int getatindex(int k) throws Exception {
            return GetNode(k).val;
        }

        public int removefirst() {
            Node temp = head;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                head = head.Next;
                temp.Next = null;
                size--;
            }
            return temp.val;
        }

        public int removeLast() throws Exception {
            if (size == 1) {
                return removefirst();
            } else {
                Node temp = GetNode(size - 2);
                temp.Next = null;
                int val = tail.val;
                tail = temp;
                size--;
                return val;
            }

        }

        public int removeatindex(int k) throws Exception {
            if (k == 0) {
                return removefirst();
            }
            else if (k == size - 1) {
                return removeLast();
            }
            else {
                Node curr = GetNode(k);
                Node prev = GetNode(k - 1);
                prev.Next = curr;
                curr.Next = null;
                size--;
                return curr.val;
            }
        }
        public Node GetNode(int k) throws Exception {
            if (k < 0 || k >= size) {
                throw new Exception("bhai k range m dede");
            }
            Node temp = head;
            for (int i = 0; i < k; i++) {
                temp = temp.Next;
            }
            return temp;
        }
    
        public void Display() {
            Node temp=head;
            while (temp != null) {
                System.out.print(temp.val + "-->");
                temp = temp.Next;
            }
            System.out.print("null");
        }
    
}
