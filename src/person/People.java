package person;

public abstract class People implements PersonInt {
    private  String firstName;
    private   String lastName;
    private int age;
    public People(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
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

//    @Override
//    public boolean equals(Object o){
//        if(o == this){
//            return true;
//        }
//
//        if(!(o instanceof Person)){
//            return false;
//        }
//
//        Person person = (Person)o;
//
//        boolean firstNameEquals = (this.firstName == null && person.firstName == null) ||
//                (this.firstName != null && this.firstName.equals(person.firstName));
//        return this.firstName == person.firstName && firstNameEquals;
//    }


}

