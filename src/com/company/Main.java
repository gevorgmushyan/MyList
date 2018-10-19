package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> list = new ArrayList<>(0);
        List<String> list1 = new ArrayList<>(0);
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("a");
        list1.add("a");
        list1.add("a");
        list.removeAll(list1);
        System.out.println(list.toString());
    }
}

class A {
    public void printA() {
        System.out.println("A");
    }
}

class B extends A{
    public void prrintB() {
        System.out.println("B");
    }
}