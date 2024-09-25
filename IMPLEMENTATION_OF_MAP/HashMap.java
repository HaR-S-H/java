package IMPLEMENTATION_OF_MAP;
import java.util.*;
public class HashMap<K,V> {
    class Node {
        K key;
        V value;
        Node next;
    }

    private ArrayList<Node> bukt;
    private int size;

    public HashMap() {
        this(4);
    }

    public HashMap(int n) {
        bukt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bukt.add(null);
        }
    }

    public void put(K key, V value) {
        int idx = hashfun(key);
        Node temp = bukt.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        temp = bukt.get(idx);
        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        nn.next = temp;
        bukt.set(idx, nn);
        size++;
    }

    public boolean containsKey(K key) {
        int idx = hashfun(key);
        Node temp = bukt.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public V get(K key) {
        int idx = hashfun(key);
        Node temp = bukt.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public V remove(K key) {
        int idx = hashfun(key);
        Node curr = bukt.get(idx);
        Node prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return null;
        }
        if (prev == null) {
            bukt.set(idx, curr.next);
            size--;
        }
    }
    
    public int hashfun(K key) {
        int bn = key.hashCode() % bukt.size();
        if (bn < 0) {
            bn += bukt.size();
        }
        return bn;
    }
    

}
//load factor=total ele/bucket size
//threshohold factor=2.0