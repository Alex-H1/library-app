package book;

public class Novel extends Book{
    private boolean tellsaStory;

    public Novel(String title, String author,
                 int wordCount, int pageCount,
                 boolean isHardCover, String genre,
                 boolean tellsaStory){
        super(title, author, wordCount, pageCount, isHardCover, genre);
        tellsaStory = tellsaStory;
    }

    public boolean getTellsaStory(){return this.tellsaStory;}
    public void setTellsaStory(){this.tellsaStory = tellsaStory;}
}