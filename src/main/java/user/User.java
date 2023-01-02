package user;

import entity.Genre;
import interfaces.IUser;

import java.util.function.Function;

public class User implements IUser {

    private final String firstName;
    private final String lastName;
    private String passWord;
    private String address;
    private String city;
    private String userName;
    private int age;
    private Genre preference;
    Function<Integer, Integer> birthdate = age -> age += 1;

    public User(String firstName,
                String lastName, String address,
                String city, String userName, String passWord,
                int age, Genre preference) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
        this.preference = preference;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final int haveBirthDate(int age) {
        return birthdate.apply(age);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof User user)) {
            return false;
        }

        boolean preferenceEquals = (this.preference == null && user.preference == null) ||
                (this.preference != null && this.preference.equals(user.preference));
        return this.preference == user.preference && preferenceEquals;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + getAge();
        hash = 31 * hash + (preference == null ? 0 : preference.hashCode());
        hash = 31 * hash + (preference == null ? 0 : preference.hashCode());
        return hash;
    }

}
