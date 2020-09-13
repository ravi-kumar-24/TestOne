package test.ravi;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUTest {
    static int capacity = 5;
    static Map<Integer, String>  map = new LinkedHashMap<>();

    public static void main(String[] args) {
        add(1,"a");
        add(2,"b");
        add(3,"c");
        add(4,"d");
        add(5,"e");
        get(1);
        get(2);
        add(6,"f");
        add(7,"g");
        add(8,"h");

        map.entrySet().stream().forEach(e -> System.out.println(e.toString()));

    }



    public static void add(Integer key, String value){
        if (capacity> map.size()){
            map.put(key, value);
        }else {
            map.remove(map.entrySet().stream().findFirst().get().getKey());
            map.put(key,value);
        }
    }

    public static String get(Integer key) {
        String va =  map.remove(key);
        map.put(key, va);
        return va;
    }

}
