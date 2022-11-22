package person;

public class Employee extends Person {
    private int id;

    public Employee(String firstName, String lastName, int age, int id){
        super(firstName,lastName,age);
        this.id = this.id;
    }

    public int setId(){
        return this.id;
    }

    public void getId(){
        this.id = id;
    }
}