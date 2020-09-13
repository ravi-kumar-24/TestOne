package com.test5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestEmp {
    public static void main(String[] args) {
        Emp e1 = new Emp(1, "ravi", 1000);
        Emp e2 = new Emp(2, "test", 2000);
        Emp e3 = new Emp(3, "xyz", 1000);
        Emp e4 = new Emp(4, "name", 4000);
        Emp e5 = new Emp(5, "one", 5000);

        List<Emp> list = new LinkedList<>();
        list.add(e3);
        list.add(e1);
        list.add(e2);

        list.add(e4);
        list.add(e5);

        Collections.sort(list);

        list.stream().forEach(System.out::println);


    }
}

