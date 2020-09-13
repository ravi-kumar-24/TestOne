package com.test9;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        Map<Emp, String> map = new HashMap<>();
       /* map.put("a","A");
        map.put("b","B");
        map.put("c","C");
        map.put("d","D");*/
        Emp e1 = new Emp(1, "ravi");
        Emp e2 = new Emp(1, "ravi");
        System.out.println(e1);
        System.out.println(e2);
        map.put(e1, "s");
        System.out.println(map.get(e1));
        for (Map.Entry<Emp, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }

    }
}

class Emp{
    int empId;
    String name;

    public Emp(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}