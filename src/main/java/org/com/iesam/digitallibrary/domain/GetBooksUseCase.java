package org.com.iesam.digitallibrary.domain;

import java.util.ArrayList;

public class GetBooksUseCase {

        private BookRepository bookRepository;

        public GetBooksUseCase(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }

        public ArrayList<Book> obtainBooks() {
            return BookRepository.obtainBooks();
        }

        public Book obtainBook(Integer bookId) {
            return bookRepository.obtainBook(bookId);
        }

        public ArrayList<Book> execute() {
            return obtainBooks();
        }
    }

