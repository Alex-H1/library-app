package person;

public class Child extends Person {
    private boolean under18;

    public Child(String firstName, String lastName, String preference, int age, boolean under18){
        super(firstName, lastName,age, preference);
        under18 = under18;

    }

    public void setUnder18(boolean under18) {
        this.under18 = under18;
    }

}