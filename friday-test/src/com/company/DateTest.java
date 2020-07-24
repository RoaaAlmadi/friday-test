package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateTest {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date d1= new Date();
        Date d2 = new Date();

        d1.get_dat();
        d1.get_month();
        d1.get_year();

        d2.set_dat(12);
        d2.set_month(12);
        d2.set_year(12);

        System.out.println("the date for get method");
        d1.display();
        System.out.println("the date for set method");
        d2.display();

    }
}


