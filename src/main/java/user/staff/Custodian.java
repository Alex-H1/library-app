package user.staff;

import entity.Genre;

import java.util.function.Predicate;

public final class Custodian extends Staff {
    private boolean floorsCleaned;
    private boolean facilitiesCleaned;
    private boolean hygieneRestocked;

    public Custodian(boolean floorsCleaned, boolean facilitiesCleaned, boolean hygieneRestocked, int empId, Predicate<String> fullTime, String firstName,
                     String lastName, String address,
                     String city, String userName, String passWord, int age, Genre preference) {
        super(firstName, lastName, address, city, userName, passWord, age, preference, empId, fullTime);
        this.floorsCleaned = floorsCleaned;
        this.facilitiesCleaned = facilitiesCleaned;
        this.hygieneRestocked = hygieneRestocked;

    }
    public Custodian(String firstName, String lastName){
        super(firstName, lastName);
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

    public boolean hygieneRestocked() {
        return this.hygieneRestocked = hygieneRestocked;
    }

    public void hygieneRestocked(boolean hygieneRestocked) {
        this.hygieneRestocked = hygieneRestocked;
    }


}
