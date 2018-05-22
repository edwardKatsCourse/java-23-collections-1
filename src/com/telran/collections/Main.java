package com.telran.collections;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        //Iterable -> Iterator
        //   |
        //  \/
        //       Collection
        //List,     Set,        Map
        //[]       unique     key    -   value
        //                    unique     can be duplicated

        //LISTS
        //ArrayList  -> .get(214) -> instantly
        //LinkedList -> .get(214) -> will sequentially iterate through 213 previous


        //SETS -> unique values
        //HashSet
        //TreeSet
        //LinkedHashSet

        //SortedSet and NavigableSet

        //MAP
        //HashMap
        //TreeMap
        //LinkedHashMap


        System.out.println("------- LIST DEMO -------");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("b");

        System.out.println("foreach for List");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();
//        for (String s : list) {
//            if (s.equals("@")){
//                System.out.println("found");
//                break;
//            }
//        }

        System.out.printf("List size: %s%n", list.size());
        System.out.printf("List content: %s%n", list);


        System.out.println("------- SET DEMO -------");
        Set<String> set = new HashSet<>();
        set.add("david@site.com");
        set.add("natalie@facebook.com");
        set.add("peter@site.com");
        set.add("david@site.com");

        System.out.printf("Set size: %s%n", set.size());
        System.out.printf("Set content: %s%n", set);

        System.out.println("foreach for Set");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println();


        System.out.println("------- MAP DEMO -------");
        //Word Count example
        //java coffee java

        //java 2
        //coffee 1

        //   word    count
        Map<String, Integer> map = new HashMap<>();


        //email, user
        //username, user
        //userId, user
        //company, List<Employees>

        //People of certain age
        //age, list<people> -> 18, [sarah, jimmy], 19, [...], 21, []

        map.put("java", 1);
        map.put("java", 2);
        map.put("java", 3);


        map.put("coffee", 1);

        System.out.println(map);

        System.out.println("foreach for Map");
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(String.format("Key: %s", m.getKey()));
            System.out.println(String.format("Value: %s", m.getValue()));
        }
    }
}
