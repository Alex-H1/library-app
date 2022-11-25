package person;
public class Person extends People{
    private String preference;
    private int id;

    public Person(String firstName, String lastName, int age, String preference){
        super(firstName, lastName, age);
        this.preference = preference;
    }

    public String getPreference(){
        return this.preference;
    }

    public void setPreference(String preference){ this.preference = preference;}


    public static void main(String[] args) {
        Person p1 = new Person("Alex", "H", 19, "science");
        Person p2 = new Person("Alex", "H", 19, "science");

        if (p1.equals(p2)) {
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }

        int hashcode1 = p1.hashCode();
        int hashcode2 = p2.hashCode();

        System.out.println(hashcode1);
        System.out.println(hashcode2);
    }

    public int birthDate(int age) {
        return age + 1;
    }

    public void printDescription(){

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

        boolean preferenceEquals = (this.preference == null && person.preference == null) ||
                (this.preference != null && this.preference.equals(person.preference));
        return this.preference == person.preference && preferenceEquals;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (int) getAge();
        hash = 31 * hash + (preference == null ? 0 : preference.hashCode());
        hash = 31 * hash + (preference == null ? 0 : preference.hashCode());
        return hash;
    }
}