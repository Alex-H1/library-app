package book;

public class Book {
    private String title;
    private String author;
    private int wordCount;
    private int pageCount;
    private boolean isHardCover;
    private String genre;

    public Book(String title, String author,
                int wordCount, int pageCount,
                boolean isHardCover, String genre){
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
        public static void main(String[] args){
        Book b1 = new Book("charlotte\'s web","E.B White" ,31938, 192, true, "Fiction");
        System.out.println(b1);

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
