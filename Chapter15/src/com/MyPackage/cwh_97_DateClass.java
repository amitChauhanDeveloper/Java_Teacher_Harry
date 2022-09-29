package com.MyPackage;

import java.util.Date;
public class cwh_97_DateClass {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE); ---> Quick quiz solution
//        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        // This method is deprecated
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());

        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
    }
}
