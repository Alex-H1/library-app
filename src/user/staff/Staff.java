package user.staff;

public abstract class Staff extends User {
    private int empId;
    private boolean fullTime;


    public Staff(int empId, boolean fullTime){
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

    public void (boolean fullTime){
        this.fullTime = fullTime;
    }
}
