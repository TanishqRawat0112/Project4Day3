package com.employee;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;



public class Main {
    public static void main(String[] args) {
        System.out.println("------ Project 4 ------");
        Book book1 = new Book("Effective Java","Joshua Bloch",2008);
        Book book2 = new Book("Harry Potter","J.K. Rowling",1997);
        Book book3 = new Book("The Last Lecture","Randy Pausch",2008);
        Book book4 = new Book("Walden","Henry David Thoreau",1854);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        Set<Book> bookSet = SetDemo.treeSetDemo(books,null);
        Set<Book> bookSet2 = SetDemo.treeSetDemo(books,"PubDateAscComparator");
        Set<Book> bookSet3 = SetDemo.treeSetDemo(books,"PubDateDescComparator");

        System.out.println("------ Book Set 1------");
        for(Book book : bookSet){
            System.out.println("book");
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
            System.out.println("Book Year: " + book.getYear());
        }

        System.out.println("------ Book Set 2------");
        for(Book book : bookSet2){
            System.out.println("book");
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
            System.out.println("Book Year: " + book.getYear());
        }

        System.out.println("------ Book Set 3------");
        for(Book book : bookSet3){
            System.out.println("book");
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
            System.out.println("Book Year: " + book.getYear());
        }

        System.out.println("------ End Of Program ------");

    }
}