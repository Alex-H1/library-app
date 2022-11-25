package book;

public class Book extends Books {

    private int flipPage;
    private int finalPage;

     public Book(String title, String author,
               int wordCount, int pageCount,
               boolean isHardCover, String genre){
        super(title, author, wordCount, pageCount,isHardCover, genre);
        this.flipPage = flipPage;
        this.finalPage = finalPage;
     }

    public int getFlipPage(){
         return this.flipPage;
    }

    public int getFinalPage(){
         return this.finalPage;
    }

    public void setFinalPage(){
         this.finalPage = finalPage;
    }
    public void setFlipPage(){
         this.flipPage = flipPage;
    }


    public static void main(String[] args){
        Book b1 = new Book("charlotte\'s web","E.B White" ,31938, 192, true, "Fiction");
        System.out.println(b1);

    }

    public int flipPage(int pageNumber) {
        return flipPage =+ 1;
    }

    @Override
    public int finalPage() {
        return this.flipPage = finalPage;
    }



}