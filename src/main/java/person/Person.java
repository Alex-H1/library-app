package person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String preference;

    public Person(String firstName, String lastName, int age, String preference){
        firstName = firstName;
        lastName = lastName;
        age = age;
        preference = preference;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getPreference(){
        return this.preference;
    }
    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setPreference(String preference){ this.preference = preference;}
}