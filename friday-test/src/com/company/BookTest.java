package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookTest {
    public static void main(String [] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Book [] book = new Book [30];
        int i=0;
        System.out.println(" How many books info you want to store ");
        int n = Integer.parseInt(br.readLine());
        System.out.printf("you want to give the values by get method or set method \nEnter 1 for get method \n 2 for set method");
        int ch = Integer.parseInt(br.readLine());
        try
        {
            if(ch==1)
            {
                for(i=0;i<n;i++)
                {
                    System.out.printf("\n Enter %d book Details\n",i+1);
                    book[i]=new Book();
                    book[i].getbook_name();
                    book[i].getisbn();
                    book[i].getauthor();
                    book[i].getpublisher();
                }
            }
            else
            {
                book[i]=new Book();
                book[i].setbook_name("Naruto");
                book[i].setisbn(19999);
                book[i].setauthor("Masashi Kishimoto");
                book[i].setpublisher("Viz Media");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        for(i=0;i<n;i++)
        {
            book[i].displayinfo();
            System.out.println();
        }
    }
}

