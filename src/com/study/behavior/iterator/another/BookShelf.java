package com.study.behavior.iterator.another;

public class BookShelf {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxLen) {
        books = new Book[maxLen];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }
}
