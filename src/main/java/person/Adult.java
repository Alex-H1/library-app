package person;

public class Adult {
    private int libraryCardNumber;
    private int booksCheckedOut;

    public Adult(String firstName, String lastName, int age,
                 String preference, int libraryCardNumber, int booksCheckedOut){
        super();
        libraryCardNumber = libraryCardNumber;
        booksCheckedOut = booksCheckedOut;
    }

    public int getBooksCheckedOut() {
        return this.booksCheckedOut;
    }
    public int getLibraryCardNumber(){
        return this.libraryCardNumber;
    }

    public void setLibraryCardNumber(){
        this.libraryCardNumber = libraryCardNumber;
    }

    public void setBooksCheckedOut(){
        this.booksCheckedOut = booksCheckedOut;
    }

}
