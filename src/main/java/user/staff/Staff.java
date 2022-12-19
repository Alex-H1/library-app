package user.staff;

import user.User;

import java.util.function.Predicate;

public abstract class Staff extends User {
    private int empId;
    private Predicate<String> fullTime;


    public Staff(String firstName,
                 String lastName, String address,
                 String city, String userName, String passWord, int age,
                 String preference, int empId, Predicate<String> fullTime) {
        super(firstName, lastName, address, city, userName, passWord, age, preference);
        this.empId = empId;
        this.fullTime = fullTime;
    }

    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Predicate<String> getFullTime() {
        return this.fullTime;
    }

    public void setFullTime(Predicate<String> getFullTime) {
        this.fullTime = fullTime;
    }
}
