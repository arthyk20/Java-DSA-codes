package com.arthy.BasicPrograms;

import java.util.ArrayList;
import java.util.List;
     class Book{
         public String title;
        public String author;
        Book (String title, String author){
            this.title = title;
            this.author = author;
        }
    }
    class Library{
        private final List <Book> books;
        Library (List <Book> books){
            this.books = books;
        }
        public List <Book> getListOfBooks(){
            return books;
        }
    }
public class Method {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Kunal");
        Book b2 = new Book("Java", "Kunal");
        Book b3 = new Book("Java", "Kunal");
        List <Book> book = new ArrayList<Book> ();
        book.add(b1);
        book.add(b2);
        book.add(b3);
        Library lib = new Library(book);
        List <Book> books = lib.getListOfBooks();
        for (Book bk : books){
            System.out.println("Title " +bk.title + " and Author " + bk.author);
        }
    }
}