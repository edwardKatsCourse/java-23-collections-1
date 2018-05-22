package com.telran.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //Design Patterns - GoF (Gang of four)
        StringBuilder builder = new StringBuilder(); // -> "Builder" design pattern


        Iterator<String> iterator = new ArrayList<String>().iterator();
        String [] arr = new String[3];

        //RandomAccess vs Sequential
        //  arr[156]        .next()      -> to get element with index 156 you need to
                                            //go through 0..155 indexes before

//        while (iterator.hasNext()) {
//            iterator.next();
//        }


    }
}

