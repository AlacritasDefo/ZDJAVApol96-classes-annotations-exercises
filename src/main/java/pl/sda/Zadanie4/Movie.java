package pl.sda.Zadanie4;

import java.util.Objects;

public class Movie implements MediaCenter {
    private String movieName;
    private String authorName;
    private String genre;
    private int publishYear;

    public Movie(String movieName, String authorName, String genre, int publishYear) {
        this.movieName = movieName;
        this.authorName = authorName;
        this.genre = genre;
        this.publishYear = publishYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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
        Movie movie = (Movie) o;
        return publishYear == movie.publishYear && Objects.equals(movieName, movie.movieName) && Objects.equals(authorName, movie.authorName) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, authorName, genre, publishYear);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", genre='" + genre + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public String getName() {
        return movieName;
    }

    @Override
    public MediaCenterType getType() {
        return MediaCenterType.MOVIE;
    }
}
