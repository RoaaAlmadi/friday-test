package com.company;

import java.io.*;
public class Book {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String book_name;
    int isbn;
    String author;
    String publisher;

    Book(){
        book_name="Naruto";
        isbn=19999;
        author="Masashi Kishimoto";
        publisher="Viz Media";
    }

    public void getbook_name()throws IOException{
        System.out.println("Enter book name");
        book_name = br.readLine();
    }
    public void getisbn()throws IOException{
        System.out.println("Enter isbn number ");
        isbn = Integer.parseInt(br.readLine());
    }
    public void getauthor()throws IOException {
        System.out.println("Enter author name");
        author = br.readLine();
    }
    public void getpublisher()throws IOException{
        System.out.println("Enter publisher name");
        publisher = br.readLine();
    }
    public void setbook_name(String book)
    {
        this.book_name=book;
    }
    public void setisbn(int isbn)
    {
        this.isbn=isbn;
    }
    public void setauthor(String author)
    {
        this.author=author;
    }
    public void setpublisher(String publisher)
    {
        this.publisher=publisher;
    }

    public void displayinfo()
    {
        System.out.println("\n Book name "+book_name);
        System.out.println("\n ISBN number "+isbn);
        System.out.println("\n Author name "+author);
        System.out.println("\n Publisher name "+publisher);
    }
}

