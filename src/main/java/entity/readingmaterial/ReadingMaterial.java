package entity.readingmaterial;

import entity.Genre;

public abstract class ReadingMaterial {
    private String title;
    private String author;
    private String synopsis;
    private Genre genre;

    public ReadingMaterial(String title, String author, String synopsis) {
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getSynopsis() {
        return this.synopsis;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Genre getGenre(){return this.genre;}


}
