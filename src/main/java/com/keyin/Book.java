package com.keyin;

import java.time.LocalDate;

public class Book {

    private Author author;
    private String title;
    private String genre;
    private boolean checkedOut;
    private LocalDate dueDate;
    private boolean isLentFromAnotherLibrary;
    private LocalDate publishedDate;

    public Book() {
    }

    public Book(Author author, String title, String genre, LocalDate publishedDate) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.checkedOut = false;
        this.isLentFromAnotherLibrary = false;
        this.publishedDate = publishedDate;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public boolean isPastDue() {
        return checkedOut && dueDate.isBefore(LocalDate.now());
    }

    public boolean isOfGenre(String genre) {
        return this.genre.equalsIgnoreCase(genre);
    }

    public boolean isLentFromAnotherLibrary() {
        return isLentFromAnotherLibrary;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setLentFromAnotherLibrary(boolean lentFromAnotherLibrary) {
        isLentFromAnotherLibrary = lentFromAnotherLibrary;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", genre='" + genre + '\'' +
                ", checkedOut=" + checkedOut +
                ", dueDate=" + dueDate +
                ", lentFromAnotherLibrary=" + isLentFromAnotherLibrary +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
