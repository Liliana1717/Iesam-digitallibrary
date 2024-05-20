package org.com.iesam.digitallibrary.data;

import org.com.iesam.digitallibrary.domain.Book;
import org.com.iesam.digitallibrary.domain.BookRepository;

import java.util.ArrayList;

public class BookDataRepository implements BookRepository {
    @Override
    public ArrayList<Book> obtainBooks(Book bookId) {
        return null;
    }

    @Override
    public Book obtainBook(Integer bookId) {
        return null;
    }
}
