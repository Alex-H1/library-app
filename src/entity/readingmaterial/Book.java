package entity.readingmaterial;
import entity.Genre;
public class Book extends ReadingMaterial implements IBook{
    private Genre genre;
    private int flipPage;
    private int endPage;

    public Book(String title, String author, String synopsis, Genre genre) {
        super(title, author, synopsis);
        this.genre =  genre;
    }

    public int getFlipPage(){
        return this.flipPage;
    }
    public int getEndPage(){
        return this.endPage;
    }

    public void setFlipPage(){
        this.flipPage = flipPage;
    }
    public void setEndPage(){
        this.endPage = endPage;
    }


    @Override
    public int nextPage(int flipPage) {
        flipPage += 1;
        return endPage = flipPage;
    }


}
