package com.employee;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

class PubDateAscComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int yearComparison = Integer.compare(b1.getYear(), b2.getYear());
        if (yearComparison != 0) {
            return yearComparison;
        }
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

class PubDateDescComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int yearComparison = Integer.compare(b2.getYear(), b1.getYear());
        if (yearComparison != 0) {
            return yearComparison;
        }
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

class SetDemo {
    public static Set<Book> treeSetDemo(List<Book> books, String comparatorType) {
        Comparator<Book> comparator;

        if (comparatorType == null) {
            comparator = Comparator.comparing(Book::getTitle);
        } else if (comparatorType.equals("PubDateAscComparator")) {
            comparator = new PubDateAscComparator();
        } else if (comparatorType.equals("PubDateDescComparator")) {
            comparator = new PubDateDescComparator();
        }else {
            throw new IllegalArgumentException("Invalid comparator type: " + comparatorType);
        }

        Set<Book> bookSet = new TreeSet<>(comparator);
        bookSet.addAll(books);
        return bookSet;
    }
}
