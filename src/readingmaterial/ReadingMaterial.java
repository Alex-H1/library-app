package readingmaterial;

public abstract class ReadingMaterial {
    private String title;
    private String author;
    private String synopsis;
    public ReadingMaterial(String title, String author, String synopsis){
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
    }
}
