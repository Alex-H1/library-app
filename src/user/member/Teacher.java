package user.member;

import entity.LibraryCard;

public final class Teacher extends Member {
    private String department;

    public Teacher(String firstName, String lastName, String address, String city, String userName, String passWord, int age, String department, LibraryCard card, String preference) {
        super(firstName, lastName, address, city, userName, passWord, age, card, preference);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
