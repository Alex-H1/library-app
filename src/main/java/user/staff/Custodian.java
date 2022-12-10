package user.staff;

public final class Custodian extends Staff {
    private boolean floorsCleaned;
    private boolean facilitiesCleaned;
    private boolean hygeneRestocked;
    // soap, hand sanitizer etc

    public Custodian(boolean floorsCleaned, boolean facilitiesCleaned, boolean hygeneRestocked, int empId, boolean fullTime, String firstName,
                     String lastName, String address,
                     String city, String userName, String passWord, int age, String preference) {
        super(firstName, lastName, address, city, userName, passWord, age, preference, empId, fullTime);
        this.floorsCleaned = floorsCleaned;
        this.facilitiesCleaned = facilitiesCleaned;
        this.hygeneRestocked = hygeneRestocked;

    }

    public boolean getFloorsCleaned() {
        return this.floorsCleaned = floorsCleaned;
    }

    public void setFloorsCleaned(boolean floorsCleaned) {
        this.floorsCleaned = floorsCleaned;
    }

    public boolean getFacilitiesCleaned() {
        return this.facilitiesCleaned = facilitiesCleaned;
    }

    public void setFacilitiesCleaned(boolean facilitiesCleaned) {
        this.facilitiesCleaned = facilitiesCleaned;
    }

    public boolean getHygeneRestocked() {
        return this.hygeneRestocked = hygeneRestocked;
    }

    public void setHygeneRestocked(boolean hygeneRestocked) {
        this.hygeneRestocked = hygeneRestocked;
    }


}
