package user.staff;

public class Custodian extends Staff{
    private boolean floorsCleaned;
    private boolean facilitiesCleaned;
    private boolean hygeneRestocked;
    // soap, hand sanitizer etc

    public Custodian(boolean floorsCleaned, boolean facilitiesCleaned, boolean hygeneRestocked, int empId, boolean fullTime, int userId, String firstName,
                     String lastName, String address,
                     String city, String userName, String passWord, int age){
        super(userId, firstName, lastName, address, city, userName, passWord, age, empId, fullTime);
        this.floorsCleaned = floorsCleaned;
        this.facilitiesCleaned = facilitiesCleaned;
        this.hygeneRestocked = hygeneRestocked;

    }

    public boolean setFloorsCleaned(){
        return this.floorsCleaned = floorsCleaned;
    }
    public boolean setFacilitiesCleaned(){
        return this.facilitiesCleaned = facilitiesCleaned;
    }
    public boolean setHygeneRestocked(){
        return this.hygeneRestocked = hygeneRestocked;
    }

    public void getFloorsCleaned(boolean floorsCleaned){
        this.floorsCleaned = floorsCleaned;
    }
    public void getFacilitiesCleaned(boolean facilitiesCleaned){
        this.facilitiesCleaned = facilitiesCleaned;
    }
    public void getHygeneRestocked(boolean hygeneRestocked){
        this.hygeneRestocked = hygeneRestocked;
    }

    @Override
    public int birthDate(int age) {
        return 0;
    }

}
