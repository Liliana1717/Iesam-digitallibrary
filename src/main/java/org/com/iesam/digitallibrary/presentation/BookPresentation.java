package org.com.iesam.digitallibrary.presentation;

import org.com.iesam.digitallibrary.domain.Book;
import org.com.iesam.digitallibrary.domain.BookRepository;
import org.com.iesam.digitallibrary.domain.GetBooksUseCase;

import java.util.ArrayList;

public class BookPresentation {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository() {
            @Override
            public ArrayList<Book> obtainBooks(Book bookId) {
                return null;
            }

            @Override
            public Book obtainBook(Integer bookId) {
                return null;
            }
        };
            GetBooksUseCase getBooksUseCase = new GetBooksUseCase(bookRepository);

            ArrayList<Book> allBooks = getBooksUseCase.obtainBooks();
            Book book = getBooksUseCase.obtainBook(1);


            System.out.println("Todos los libros: " + allBooks);
            System.out.println("Libro con ID 1: " + book);
        }

    }
