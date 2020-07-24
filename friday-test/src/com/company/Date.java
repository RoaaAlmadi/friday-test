package com.company;

import java.io.*;
public class Date {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int dat;
    int month;
    int year;

    Date() {
        dat=01;
        month=01;
        year=2001;
    }

    public void get_dat()throws IOException {
        System.out.println("Enter date");
        dat=Integer.parseInt(br.readLine());
    }

    public void get_month()throws IOException {
        System.out.println("Enter month");
        month=Integer.parseInt(br.readLine());
    }

    public void get_year()throws IOException {
        System.out.println("Enter year");
        year=Integer.parseInt(br.readLine());
    }

    public void set_dat(int dat) {
        this.dat=dat;
        //System.out.println(dat);
        //return dat;
    }

    public void set_month(int mon) {
        month=mon;
    }

    public void set_year(int year) {
        this.year=year;
    }

    public void display() {
        System.out.println("Entered Date : "+dat+"/"+month+"/"+year);
    }
}
