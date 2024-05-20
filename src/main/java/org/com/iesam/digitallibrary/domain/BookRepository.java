package org.com.iesam.digitallibrary.domain;

import java.util.ArrayList;

public interface BookRepository {
    static ArrayList<Book> obtainBooks() {
        return obtainBooks();
    }

    ArrayList<Book> obtainBooks(Book bookId);

    Book obtainBook(Integer bookId);
}
