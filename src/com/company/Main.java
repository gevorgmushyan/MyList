package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<A> list = new ArrayList<>(10);
        A a = new A();
        B b = new B();
        //list.add(a);
        System.out.println(list.containsAll(null));
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