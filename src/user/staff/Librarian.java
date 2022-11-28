package user.staff;

public final class Librarian extends Staff implements ILibrarian{
    private boolean putAwayBooks;

    public Librarian(int userId, String firstName,
                     String lastName, String address,
                     String city, String userName, String passWord, int age,
                     int empId, boolean fullTime,  boolean putAwayBooks){
        super(userId, firstName, lastName, address, city, userName, passWord, age, empId, fullTime);
        this.putAwayBooks = putAwayBooks;
    }
    public boolean getPutAwayBooks(){return this.putAwayBooks;}
    public void setPutAwayBooks(boolean putAwayBooks){this.putAwayBooks = putAwayBooks;}

    public boolean checkBook(boolean putAwayBooks){
        if(this.putAwayBooks == false){
            System.out.println("The books are now put away");
            return this.putAwayBooks = true;
        } else {
            System.out.println("books are already put away");
            return this.putAwayBooks ;
        }
    }

}
