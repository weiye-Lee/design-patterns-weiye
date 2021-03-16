package com.study.behavior.iterator;

public class BookShelf {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxLen) {
        this.books = new Book[maxLen];
    }

    public Book getBook(int index) {
        return books[index];
    }

    public Book[] getBooks() {
        return books;
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
