package pl.sda.Zadanie4;

import java.util.Objects;

public class Newspaper implements MediaCenter{
    private String newspaperName;
    private String authorName;
    private int    date;

    public Newspaper(String newspaperName, String authorName, int date) {
        this.newspaperName = newspaperName;
        this.authorName = authorName;
        this.date = date;

    }

    public String getNewspaperName() {
        return newspaperName;
    }

    public void setNewspaperName(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Newspaper newspaper = (Newspaper) o;
        return date == newspaper.date && Objects.equals(newspaperName, newspaper.newspaperName) && Objects.equals(authorName, newspaper.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newspaperName, authorName, date);
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "newspaperName='" + newspaperName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public String getName() {
        return newspaperName;
    }

    @Override
    public MediaCenterType getType() {
        return MediaCenterType.NEWSPAPER;
    }
}
