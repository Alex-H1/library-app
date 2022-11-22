package book;

public class TextBook extends Book {
    private String subject;


    public TextBook(String title, String author,
                    int wordCount, int pageCount,
                    boolean isHardCover, String genre, String subject) {
        super(title, author, wordCount, pageCount, isHardCover, genre);
        subject = subject;
    }

    public String getSubject(){return this.subject;}

    public void setSubject(){this.subject = subject;}
}