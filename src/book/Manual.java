package book;

public class Manual extends Book{
    private String productManual;

    public Manual(String title, String author, int wordCount, int pageCount, boolean isHardCover, String genre, String productManual) {
        super(title, author, wordCount, pageCount, isHardCover, genre);
        this.productManual = productManual;
    }

    public String getProductManual(){
       return this.productManual;
    }

    public void setProductManual(){
        this.productManual = productManual;
    }
}