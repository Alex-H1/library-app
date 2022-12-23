package user.member;

import entity.LibraryCard;
import entity.readingmaterial.ReadingMaterial;
import interfaces.IStudent;

import java.util.ArrayList;

public final class Student extends Member implements IStudent {
    private Teacher teacher;
    private int gradeLevel;
    private int completedHwAssignment;


    public Student(String firstName,
                   String lastName, String address,
                   String city, String userName,
                   String passWord, Teacher teacher,
                   int age, LibraryCard card, String preference, int gradeLevel, ArrayList<ReadingMaterial> checkedOutBooks) {
        super(firstName, lastName, address, city, userName, passWord, age, card, preference, checkedOutBooks);
        this.teacher = teacher;
        this.gradeLevel = gradeLevel;
    }
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public Teacher getTeacher() {
        return this.teacher;
    }

    public int getGrade() {
        return this.gradeLevel;
    }

    public int getCompletedHwAssignment() {
        return this.completedHwAssignment;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setGrade(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setCompletedHwAssignment(int completedHwAssignment) {
        this.completedHwAssignment = completedHwAssignment;
    }

    public int completedAssignments(boolean finishedHw) {
        return completedHwAssignment += 1;
    }

}
