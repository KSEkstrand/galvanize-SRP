package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void bookFormattedNameReturnsCorrectly() {
        Book book = new Book();
        Author author = new Author();
        Publisher publisher = new Publisher();
        author.setAuthorFirstName("Eric");
        author.setAuthorLastName("Evans");
        book.setBookTitle("Domain-Driven Design");
        book.setBookYear(2004);
        publisher.setPublisherName("Addison-Wesley");
        publisher.setPublisherCity("New York");

        book.setAuthor(author);
        book.setPublisher(publisher);

        String expected = "Domain-Driven Design (2004)\n" +
                "Written by Evans, Eric\n" +
                "Published by Addison-Wesley, New York";

        assertEquals(expected, book.getFormattedBookName());
    }
}
