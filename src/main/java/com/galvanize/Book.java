package com.galvanize;

public class Book {

    private String bookTitle;
    private int bookYear;
    private Publisher publisher;
    private Author author;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookName) {
        this.bookTitle = bookName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String getFormattedBookName() {
        return String.format(
                "%s (%s)\nWritten by %s\nPublished by %s",
                getBookTitle(),
                getBookYear(),
                author.getFormattedAuthorName(),
                publisher.getFormattedPublisherName()
        );
    }
}
