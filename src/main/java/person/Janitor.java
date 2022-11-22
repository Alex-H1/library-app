package person;

public class Janitor extends Employee {
    boolean doneCleaning;

    public Janitor(String firstName, String lastName, int age, int id, boolean doneCleaning){
        super(firstName, lastName, age, id);
        doneCleaning = doneCleaning;
    }

    public boolean setDoneCleaning(){
        return this.doneCleaning;
    }

    public void getDoneCleaning(){

    }

}