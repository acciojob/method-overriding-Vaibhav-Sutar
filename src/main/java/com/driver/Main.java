package com.driver;



public class Main {
    public static void main(String[] args) {
        B objectB = new B();

        System.out.println(objectB.meth());

        System.out.println(((A)objectB).meth());
    }
}