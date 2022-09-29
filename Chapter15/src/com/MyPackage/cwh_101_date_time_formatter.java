package com.MyPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m:s a "); // This is format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);
    }
}
