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

        String alphabet = "abcdfegh";
        CharacterIterable iterable = new CharacterIterable(alphabet);
        for (char c : iterable) {
            System.out.println(c);
        }

        System.out.println("--- while loop ---");

        Iterator<Character> characterIterator = iterable.iterator();
        while (characterIterator.hasNext()) {
            char c = characterIterator.next();
//            System.out.printf("Printing character: %s%n", c);

            characterIterator.remove();
        }

    }
}

class CharacterIterable implements Iterable<Character> {

    private String initialString;

    public CharacterIterable(String initialString) {
        this.initialString = initialString;
    }

    @Override
    public Iterator<Character> iterator() {
        return new CharacterIterator(this.initialString);
    }
}


class CharacterIterator implements Iterator<Character> {

    private String initialString;
    private int currentPosition;

    public CharacterIterator(String initialString) {
        this.initialString = initialString;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < this.initialString.length();
    }

    @Override
    public Character next() {
        return this.initialString.charAt(currentPosition++);
    }

    @Override
    public void remove() {
        --currentPosition;
        //initialField = abcdefg
        //Assume, we are looking at character 'c'
        //firstPart = ab
        String firstPart = this.initialString.substring(0, currentPosition);

        //secondPart = defg
        String secondPart = this.initialString.substring(currentPosition+1, this.initialString.length());

//        System.out.println(String.format("Removing character: %s", this.initialString.charAt(currentPosition)));
        this.initialString = firstPart + secondPart;

        System.out.println(this.initialString);

    }
}