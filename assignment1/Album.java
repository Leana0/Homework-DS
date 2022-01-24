package assignment1;

import java.time.LocalDate;

public class Album {

    private  int id;

    private String title;

    private String genre;

    private LocalDate publishedYear;

    public Album(int id, String title, String genre, LocalDate publishedYear) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.publishedYear = publishedYear;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(LocalDate publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Album() {
    }
}

