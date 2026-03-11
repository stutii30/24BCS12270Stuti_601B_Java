package com.library.service;
import com.library.books.Books;
import com.library.exception.BookNotAvailableException;
import com.library.exception.BookNotFoundException;

import java.awt.print.Book;
import java.io.*;
import java.util.Scanner;

public class LibraryService {
    File f=new File("books.txt");
    public void addbook(Books b) throws IOException {
        FileWriter fw=new FileWriter("books.txt",true);
        fw.write(b.getBookid()+"\n"+b.getTitle()+"\n"+b.getAuthor()+"\n"+b.getAvailablecopies());
        fw.close();
        System.out.println("Book added");

    }
    public void viewbook() throws IOException{
        File f=new File("books.txt");
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    Scanner sc=new Scanner(System.in);
    public void issuebook(Books b) throws BookNotFoundException, BookNotAvailableException {
        int bid=sc.nextInt();
        sc.nextLine();
        int c=b.getAvailablecopies();
        if(bid!=b.getBookid()){
            throw new BookNotFoundException("Book ID not found");
        }
        if(b.getAvailablecopies()>=1) {
            b.setAvailablecopies(c-1);
        }
        else{
            throw new BookNotAvailableException("Book not Available");
        }
        System.out.println("Book Issued!!");
    }
    public void returnbook(Books b){
        int c=b.getAvailablecopies();
        b.setAvailablecopies(c+1);
        System.out.println("Book Returned!!!");
    }
}
