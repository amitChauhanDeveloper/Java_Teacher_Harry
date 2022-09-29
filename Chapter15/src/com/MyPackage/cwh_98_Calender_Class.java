package com.MyPackage;

import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98_Calender_Class {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c1 = Calendar.getInstance(); // By default india time zone
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c1.getTimeZone().getID()); // By default india time zone
        System.out.println(c.getTime());
    }
}
