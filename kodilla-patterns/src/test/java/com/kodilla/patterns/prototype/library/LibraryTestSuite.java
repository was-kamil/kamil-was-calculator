package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;


public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("National Library");

        Book book1 = new Book("Title001", "Author001", LocalDate.of(2008, 12, 10));
        Book book2 = new Book("Title002", "Author002", LocalDate.of(2010, 11, 11));
        Book book3 = new Book("Title003", "Author003", LocalDate.of(2012, 10, 12));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Library clonedLibrary = null;
            try {
                clonedLibrary = library.shallowCopy();
                clonedLibrary.setName("National Library -shallow");
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        Library deepClonedLibrary = null;
            try {
                deepClonedLibrary = library.deepCopy();
                deepClonedLibrary.setName("National Library -deep");
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        //When
        library.removeBook(book1);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}