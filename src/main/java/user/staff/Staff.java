package user.staff;

import user.User;

public abstract class Staff extends User {
    private int empId;
    private boolean fullTime;


    public Staff(String firstName,
                 String lastName, String address,
                 String city, String userName, String passWord, int age,
                 String preference, int empId, boolean fullTime) {
        super(firstName, lastName, address, city, userName, passWord, age, preference);
        this.empId = empId;
        this.fullTime = fullTime;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public boolean getFullTime() {
        return this.fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
}