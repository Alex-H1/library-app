import book.Book;

public class ChildrensBook extends Book {
    private boolean hasPictures;

    public ChildrensBook ()

    public boolean getHasPictures(boolean hasPictures){
       return this.hasPictures;
    }

    public void  setHasPictures(boolean hasPictures){
        this.hasPictures = hasPictures;
    }
}