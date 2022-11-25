package book;

public abstract class Books implements BookInt{
    private String title;
    private String author;
    private String genre;
    private int wordCount;
    private int pageCount;
    private boolean isHardCover;

    public Books(String title, String author, int wordCount, int pageCount, boolean isHardCover, String genre) {
        this.title  = title;
        this.author = author;
        this.wordCount = wordCount;
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
        this.genre = genre;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public int getWordCount(){
        return this.wordCount;
    }

    public int getPageCount(){
        return this.pageCount;
    }



    public boolean getIsHardcover(){
        return this.isHardCover;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setWordCount(int wordCount){
        this.wordCount = wordCount;
    }

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean isHardCover){
        this.isHardCover = isHardCover;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public String toString(){
        return this.title + " By " + this.author +
                " is a " + this.genre
                + " has " + this.wordCount + " words "
                + "and has " + this.pageCount + " pages " + "and is a hardcover is "
                + this.isHardCover;
    }
}
