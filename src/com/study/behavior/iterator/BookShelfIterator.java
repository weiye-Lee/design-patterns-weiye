package com.study.behavior.iterator;

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }


    @Override
    public Object next() {
        Book book =  bookShelf.getBook(index);
        index++;
        return book;

    }

    @Override
    public boolean hasNext() {
        boolean bool = false;
        if (index < bookShelf.getLength()) {
            bool = true;
        }
        return bool;
    }

    @Override
    public String toString() {
        return "BookShelfIterator{" +
                "bookShelf=" + bookShelf +
                ", index=" + index +
                '}';
    }
}
