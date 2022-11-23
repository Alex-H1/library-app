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

    public void main(String[] args) {
        Person p1 = new Person("Alex", "h", 19, "science");
        Person p2 = new Person("Alex", "h", 19, "science");
        System.out.println(p1);
    }

//    @Override
    public boolean equals(Person p1){
        if(p1 == this){
            return true;
        }
        if(!(p1 instanceof Person)){
            return false;
        }
        Person p2 = (Person)p1;
        boolean firstNameEquals = (this.firstName == null && p2.firstName == null) ||
                (this.firstName != null && this.firstName.equals(p2.firstName));
        return this.lastName == p2.lastName && firstNameEquals;
    }



}