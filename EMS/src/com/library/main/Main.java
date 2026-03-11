package com.library.main;
import com.library.books.Books;
import com.library.service.LibraryService;
import java.util.Scanner;
import java.io.*;
import com.library.exception.*;
public class Main {
    public static void main(String[] args) throws IOException, BookNotFoundException, BookNotAvailableException {
        Scanner sc=new Scanner(System.in);
        LibraryService ls=new LibraryService();
            System.out.println("Enter ID");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Title");
            String title=sc.nextLine();
            System.out.println("Enter Author");
            String author=sc.nextLine();
            System.out.println("Enter copies");
            int copies=sc.nextInt();
            Books b=new Books(id,copies,author,title);
            ls.addbook(b);
            ls.viewbook();
            try {
                ls.issuebook(b);
                b.displaybooks();
            }
        catch(BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
            catch(BookNotAvailableException a){
                System.out.println(a.getMessage());
            }
        }

    }

