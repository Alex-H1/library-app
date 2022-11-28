package entity.readingmaterial;

public class NewsPaper extends ReadingMaterial {
    private String publisher;
    private int publishDate;
    private int date;

    public NewsPaper(String title, String author, String synopsis,String publisher, int publishDate){
        super(title, author, synopsis);
        this.publisher = publisher;
        this.publishDate = publishDate;
    }

    public String getPublisher(){return this.publisher;}
    public int getPublishDate(){return this.publishDate;}
    public int getDate(){return this.date;}

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
    public void setDate(int publishDate){this.date = date;}


}
