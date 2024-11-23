package com.keyin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;

    @BeforeEach
    void setUp() {
        Author author = new Author("Leigh", "Bardugo");
        book = new Book(author, "Ninth House", "Fantasy", LocalDate.of(2019, 10, 8));
    }

    @Test
    public void testIsCheckedOut() {
        assertFalse(book.isCheckedOut(), "Book should initially NOT be checked out.");
        book.setCheckedOut(true);
        assertTrue(book.isCheckedOut());
    }

    @Test
    public void testIsPastDue() {
        book.setDueDate(LocalDate.now().minusDays(1));
        book.setCheckedOut(false);
        assertTrue(book.isPastDue(), "Book should be past due if due date is before today and book is checked out.");
    }

    @Test
    public void testIsOfGenre() {
        assertTrue(book.isOfGenre("Fantasy"), "Book should be of genre 'Fantasy'.");
        assertFalse(book.isOfGenre("Romance"), "Book should NOT be of genre 'Romance'.");
    }

    @Test
    public void testIsLentFromAnotherLibrary() {
        book.setLentFromAnotherLibrary(true);
        assertTrue(book.isLentFromAnotherLibrary(), "Book should be marked as lent from another library.");
    }
}