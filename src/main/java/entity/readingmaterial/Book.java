package entity.readingmaterial;

import entity.Genre;
import interfaces.IBook;

public class Book extends ReadingMaterial implements IBook {
    private final Genre genre;
    private int flipPage;
    private int endPage;
    private int pageCount;

    public Book(String title, String author, String synopsis, Genre genre) {
        super(title, author, synopsis);
        this.genre = genre;
    }

    public void setFlipPage() {
        this.flipPage = flipPage;
    }

    public void setEndPage() {
        this.endPage = endPage;
    }

    public void setPageCount() {
        this.pageCount = pageCount;
    }

    public int getFlipPage() {
        return this.flipPage;
    }

    public int getEndPage() {
        return this.endPage;
    }

    public int getPageCount() {
        return this.pageCount;
    }
    public Genre getGenre(){return this.genre;}


    @Override
    public int nextPage(int flipPage) {
        flipPage += 1;
        return endPage = flipPage;
    }

    @Override
    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " is a " + this.genre.getName() + " and has  " + this.pageCount;
    }

}
