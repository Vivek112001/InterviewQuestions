package com.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("lichi");

        fruits.remove("lichi"); //removing elements

        Collections.sort(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(1)); //first element
        System.out.println(fruits.get(2)); //last element
        System.out.println(fruits.isEmpty());// checks if empty
        System.out.println(fruits.contains("apple"));// checks elements

        System.out.println(fruits);
    }
}
