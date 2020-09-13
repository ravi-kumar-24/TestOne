package com.test7;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        System.out.println("hello");
        List<String> list = Arrays.asList("A", "A","A","B","C","C", "C","B","B", "C");
        getWinner(list);
    }

    public static String getWinner(List<String> votes){

        Collection<List<String>> entries =   votes.stream().collect(Collectors.groupingBy(str ->str)).values();

        entries.stream().forEach(System.out::println);
        /*List<Person> personList =  entries.
                stream().
                map(e  -> new Person(e.getKey() , (int)e.getValue().stream().count())).
                collect(Collectors.toList());*/
       /* //System.out.println(aa);
        long countA = votes.stream().filter( v -> v.endsWith("A")).count();
        long countB = votes.stream().filter( v -> v.endsWith("B")).count();
        long countC = votes.stream().filter( v -> v.endsWith("C")).count();

        Person personA = new Person((int) countA,"A");
        Person personB = new Person((int) countB,"B");
        Person personC = new Person((int) countC,"C");*/
/*
        List<Person> personList = new LinkedList<>();
        personList.add(personA);
        personList.add(personB);
        personList.add(personC);*/

       // Collections.sort(personList);

        //personList.stream().forEach(System.out::println);
      // Person p = personList.get(0);
      // System.out.println(p);
        return "";
    }
}

class Person implements Comparable<Person>{

    Integer noOfVotes;
    String name;

    public Person( String name,Integer noOfVotes) {
        this.noOfVotes = noOfVotes;
        this.name = name;
    }

    public Integer getNoOfVotes() {
        return noOfVotes;
    }

    public void setNoOfVotes(Integer noOfVotes) {
        this.noOfVotes = noOfVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        int noOfVote = o.getNoOfVotes().compareTo(this.getNoOfVotes());
        if(noOfVote==0){
          return this.getName().compareTo(o.getName());
        }
        return noOfVote;
    }

    @Override
    public String toString() {
        return "Person{" +
                "noOfVotes=" + noOfVotes +
                ", name='" + name + '\'' +
                '}';
    }
}