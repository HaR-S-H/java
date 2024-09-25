package SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class blue {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(2);
        // set.add(12);
        // set.add(3);
        // set.add(-45);
        // System.out.println(set);
        // //cotains
        // System.out.println(set.contains(5));//false
        // System.out.println(set.contains(3));//true
        // //remove
        // System.out.println(set.remove(5));
        // System.out.println(set.remove(3));
        // System.out.println(set);
        // for (Integer v : set) {
        //     System.out.println(v + " ");
        // }
        // System.out.println();

        TreeSet<Integer> set = new TreeSet<>(); //o(n)
        set.add(2);
        set.add(12);
        set.add(3);
        set.add(-45);
        System.out.println(set);
        //cotains
        System.out.println(set.contains(5));//false
        System.out.println(set.contains(3));//true
        //remove
        System.out.println(set.remove(5));
        System.out.println(set.remove(3));
        System.out.println(set);
        for (Integer v : set) {
            System.out.println(v + " ");
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>(); //o(n)
        set.add(2);
        set.add(12);
        set.add(3);
        set.add(-45);
        System.out.println(set);
        //cotains
        System.out.println(set.contains(5));//false
        System.out.println(set.contains(3));//true
        //remove
        System.out.println(set.remove(5));
        System.out.println(set.remove(3));
        System.out.println(set);
        for (Integer v : set) {
            System.out.println(v + " ");
        }
       

    }
}
