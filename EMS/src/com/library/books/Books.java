package com.library.books;
public class Books {
    private int bookid;
    private int availablecopies;
    private String  title;
    private String author;
    public Books(int bookid, int availablecopies, String title, String author) {
        this.bookid = bookid;
        this.availablecopies = availablecopies;
        this.title = title;
        this.author = author;
    }
    public int getBookid(){
        return bookid;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getAvailablecopies(){
        return availablecopies;
    }
    public void setAvailablecopies(int copies){
        this.availablecopies=copies;

    }
    public void displaybooks(){
        System.out.println("BookID"+bookid);
        System.out.println("Title"+title);
        System.out.println("Author"+author);
        System.out.println("Available Copies"+availablecopies);
    }
}
