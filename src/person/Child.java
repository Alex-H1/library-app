package person;

public class Child extends Person implements childs {
    private boolean under18;
    private String addBook;


    public Child(String firstName, String lastName, int age, String preference, boolean under18) {
        super(firstName, lastName, age, preference);
        this.under18 = under18;
    }

    public boolean getUnder18(){
        return this.under18;
    }

    public void setUnder18(){
        this.under18 = under18;
    }

     public static void main(String[] args) {

    }


    public String addBook(String addBook) {
        return this.addBook = addBook;
    }
}