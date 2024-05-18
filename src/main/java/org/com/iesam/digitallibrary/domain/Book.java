package org.com.iesam.digitallibrary.domain;

public class Book {

    public Integer bookId;
    public String tittle;

    public String author;

    public String publishing;

    public Book(Integer bookId, String tittle, String author, String publishing) {
        this.bookId = bookId;
        this.tittle = tittle;
        this.author = author;
        this.publishing = publishing;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }
}
