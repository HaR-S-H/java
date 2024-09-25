package ARRAYLIST;

import java.util.ArrayList;

public class blue {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>(100); //by default 10 size ka array bnta h
        System.out.println(ll);
        System.out.println(ll.size());
        ll.add(10);
        ll.add(10);
        ll.add(105);
        ll.add(-10);
        //agr add krte krte capacity se bhar hm element dalne ko koshish krte h toh arraylist apni capacity khud w khud bdata h (oldcap+(oldcap/2)) aur 1.5 se grow krti h
        System.out.println(ll);
        ll.add(1, 3);
        System.out.println(ll);
        //get
        System.out.println(ll.get(2));
        //remove
        System.out.println(ll.remove(2));
        System.out.println(ll);
        //set
        ll.set(1, -30);
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        //for_each
        for ( int v : ll) {
            System.out.println(v+" ");
        }
    }
}
