package com.MyPackage;

import java.util.*;

public class cwh_91_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(600); // index 7
        l1.add(7); // index 3
        l2.add(9); // index 8
        l1.add(9); // index 4
        l1.add(10); // index 5
        l2.add(110); // index 9
        l1.add(12); // index 6
        l1.add(0,55); // index 0
        l1.add(1,60); // index 2
        l1.add(0,56); // index 1
        l1.addAll(l2);
        l1.ensureCapacity(1000); // minimum capacity of the array
        System.out.println(l1.contains(10));
        System.out.println(l1.indexOf(9));
        System.out.println(l1.lastIndexOf(9));
//        l1.clear();
        l1.set(1,500);

        for(int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
