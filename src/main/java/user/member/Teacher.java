package user.member;

import entity.Genre;
import entity.LibraryCard;
import entity.readingmaterial.ReadingMaterial;

import java.util.ArrayList;

public final class Teacher extends Member {
    private String department;

    public Teacher(String firstName, String lastName, String address, String city, String userName, String passWord, int age, String department, LibraryCard card, Genre preference, ArrayList<ReadingMaterial> checkedOutBooks) {
        super(firstName, lastName, address, city, userName, passWord, age, card, preference, checkedOutBooks);
        this.department = department;
    }

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
