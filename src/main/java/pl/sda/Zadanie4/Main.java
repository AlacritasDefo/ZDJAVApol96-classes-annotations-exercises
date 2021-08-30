package pl.sda.Zadanie4;

import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("HarryPotter", "Rowling", "Fantasy", "12345", 1998);
        Movie movie1 = new Movie("HarryPotter", "Rowling", "Fantasy", 1998);

        Library<MediaCenter> mediaCenterLibrary = new Library<>();
        mediaCenterLibrary.addMedia(book1);
        mediaCenterLibrary.addMedia(movie1);

        Optional<MediaCenter> harryPotter1 = mediaCenterLibrary.mediaBorrow("HarryPotter");

        System.out.println(harryPotter1);

        Optional<MediaCenter> harryPotter = mediaCenterLibrary.mediaBorrowByNameAndType("HarryPotter", MediaCenterType.MOVIE);

        System.out.println(harryPotter);


    }
}
