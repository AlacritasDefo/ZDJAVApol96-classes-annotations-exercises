package pl.sda.Zadanie4;

import java.util.Objects;

public class Book implements MediaCenter{
    private String bookName;
    private String authorName;
    private String genre;
    private String isbn;
    private int publishYear;

    public Book(String bookName, String authorName, String genre, String isbn, int publishYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.genre = genre;
        this.isbn = isbn;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName) && Objects.equals(genre, book.genre) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, genre, isbn, publishYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", genre='" + genre + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public String getName() {
        return bookName;
    }

    @Override
    public MediaCenterType getType() {
        return MediaCenterType.BOOK;
    }
}
