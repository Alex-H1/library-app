package user.staff;

import user.User;

public abstract class Staff extends User {
    private int empId;
    private boolean fullTime;


    public Staff(int userId, String firstName,
                 String lastName, String address,
                 String city, String userName, String passWord, int age,
                 int empId, boolean fullTime) {
        super(userId, firstName, lastName, address, city, userName, passWord, age);
        this.empId = empId;
        this.fullTime = fullTime;
    }

    public int getEmpId() {
        return this.empId;
    }
    public boolean getFullTime(){
        return this.fullTime;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }
    public void setFullTime(boolean fullTime){
        this.fullTime = fullTime;
    }
}
