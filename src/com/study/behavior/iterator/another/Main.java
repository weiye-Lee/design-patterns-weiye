package com.study.behavior.iterator.another;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对于集合来说可以直接使用迭代器进行遍历
 * 认为设计模式中迭代器模式并没有什么作用
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("细说java"));

//        Iterator<BookShelf> iterator = bookShelf.iterator();
        List<Book> books = new ArrayList<>();
        books.add(new Book("图解设计模式"));
        books.add(new Book("图解java"));

        Iterator iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }

    }
}
