package HASHMAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class blue {
    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>(); //searching O(1)
        // //add
        // map.put("Raj", 78);
        // map.put("Ankit", 34);
        // map.put("Kunal", 23);
        // map.put("Kamlesh", 58);
        // map.put("Amisha", 58);
        // System.out.println(map);
        // //get
        // System.out.println(map.get("Ankit"));
        // System.out.println(map.get("Rajesh")); //null
        // //remove
        // System.out.println(map.remove("Ankit"));
        // System.out.println(map.remove("Rajesh")); //null
        // System.out.println(map.containsKey("Rajesh"));//false
        // System.out.println(map.put(null, 23)); //hm null bs ek hi key ko rkh skte h

        // TreeMap<String, Integer> map = new TreeMap<>(); //red black tree implement kiya gya h  searching in 0(n)
        // map.put("Raj", 78);
        // map.put("Ankit", 34);
        // map.put("Kunal", 23);
        // map.put("Kamlesh", 58);
        // map.put("Amisha", 58);
        // System.out.println(map);
        // get
        // System.out.println(map.get("Ankit"));
        // System.out.println(map.get("Rajesh")); //null
        // //remove
        // System.out.println(map.remove("Ankit"));
        // System.out.println(map.remove("Rajesh")); //null
        // System.out.println(map.containsKey("Rajesh"));//false
        // System.out.println(map.put(null, 23)); //isme null work nhi hoga

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); //searching on O(1)
        //add
        map.put("Raj", 78);
        map.put("Ankit", 34);
        map.put("Kunal", 23);
        map.put("Kamlesh", 58);
        map.put("Amisha", 58);
        System.out.println(map);
        //get
        System.out.println(map.get("Ankit"));
        System.out.println(map.get("Rajesh")); //null
        //remove
        System.out.println(map.remove("Ankit"));
        System.out.println(map.remove("Rajesh")); //null
        System.out.println(map.containsKey("Rajesh"));//false
        // System.out.println(map.put(null, 23)); //isme null work nhi hoga
        // Set<String> s = map.keySet();
        // for (String key : s) {
        //     System.out.println(key+" "+map.get(key));
        // }
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
//map->interface (HashMap,TreeMap,LinkedHashMap) key-value                   
//set->interface