package book;

public class ChildrensBook extends Book {
    private boolean hasPictures;

    public ChildrensBook (String title, String author,
                          int wordCount, int pageCount,
                          boolean isHardCover, String genre, boolean hasPictures){
        super(title, author, wordCount, pageCount, isHardCover, genre);
        hasPictures = hasPictures;
    }


    public boolean getHasPictures(boolean hasPictures){
       return this.hasPictures;
    }

    public void  setHasPictures(boolean hasPictures){
        this.hasPictures = hasPictures;
    }
}