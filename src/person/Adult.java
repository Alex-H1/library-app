package person;


public class Adult extends Person implements Adults{
    private int libraryCardNumber;
    private int booksCheckedOut;


    public Adult(String firstName, String lastName, int age, String preference, int libraryCardNumber, int booksCheckedOut) {
        super(firstName, lastName, age, preference);
        this.libraryCardNumber = libraryCardNumber;
        this.booksCheckedOut = booksCheckedOut;
    }

    public int getBooksCheckedOut() {
        return this.booksCheckedOut;
    }
    public final int getLibraryCardNumber(){
        return this.libraryCardNumber;
    }

    public final void setLibraryCardNumber(){
        this.libraryCardNumber = libraryCardNumber;
    }

    public  void setBooksCheckedOut(){
        this.booksCheckedOut = booksCheckedOut;
    }

    public void printDescription(){
        System.out.println("");
    }
    @Override
    public int buyBook(int booksCheckedOut) {
        return booksCheckedOut + 1;
    }

    @Override
    public final int getLibraryCard(int libraryCardNumber) {
        return libraryCardNumber;
    }
}