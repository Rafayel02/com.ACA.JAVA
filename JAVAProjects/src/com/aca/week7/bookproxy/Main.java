package com.aca.week7.bookproxy;

import com.aca.week7.bookproxy.books.Book;
import com.aca.week7.bookproxy.books.ProxyBook;

public class Main {

    public static void main(String[] args) {
        ProxyBook bookProxy = new ProxyBook();
        bookProxy.setTitle("Valodik Lescaut");
        bookProxy.setAuthor("Valodik");

        bookProxy.load();
//        bookProxy.load();

        System.out.println(bookProxy.getTitle());
        System.out.println(bookProxy.getAuthor());

        ProxyBook bookProxy2 = new ProxyBook();
        bookProxy2.setTitle("Valodik Lescaut");
        bookProxy2.setAuthor("Valodik");

        System.out.println(bookProxy2.getTitle());
        System.out.println(bookProxy2.getAuthor());

    }

}
