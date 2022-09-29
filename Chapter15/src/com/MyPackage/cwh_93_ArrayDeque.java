package com.MyPackage;

import java.util.ArrayDeque;

public class cwh_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(56);
        ad1.add(70);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
//        System.out.println(ad1.removeLast()); --> remove the array index
        System.out.println(ad1);
    }
}
