package person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String preference;

    public Person(String firstName, String lastName, int age, String preference){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.preference = preference;
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


    public static void main(String[] args) {
        Person p1 = new Person("Alex", "H", 19, "science");
        Person p2 = new Person("John", "H", 19, "science");

        if (p1.equals(p2)) {
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof Person)){
            return false;
        }

        Person person = (Person)o;

        boolean firstNameEquals = (this.firstName == null && person.firstName == null) ||
                (this.firstName != null && this.firstName.equals(person.firstName));
        return this.firstName == person.firstName && firstNameEquals;
    }

}