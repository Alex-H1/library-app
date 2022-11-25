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
    public int getLibraryCardNumber(){
        return this.libraryCardNumber;
    }

    public void setLibraryCardNumber(){
        this.libraryCardNumber = libraryCardNumber;
    }

    public void setBooksCheckedOut(){
        this.booksCheckedOut = booksCheckedOut;
    }

    @Override
    public int buyBook(int booksCheckedOut) {
        return booksCheckedOut + 1;
    }

    @Override
    public int getLibraryCard(int libraryCardNumber) {
        return libraryCardNumber;
    }
}