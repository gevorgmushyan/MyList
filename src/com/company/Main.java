package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //List<String> list = new MyList<>();
        List<String> list = new ArrayList<>();
        list.add("1" );
        list.add("2" );
        list.add("3" );
        list.add("4" );
        list.add("5" );
        list.add("6" );
        ListIterator it  = list.listIterator();
        list.subList(0, 3).clear();
        System.out.println(list.toString());
    }

}

class A {
    public void printA() {
        System.out.println("A");
    }
}

class B extends A {
    public void prrintB() {
        System.out.println("B");
    }
}