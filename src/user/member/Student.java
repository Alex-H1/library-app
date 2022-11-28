package user.member;
import entity.LibraryCard;

public final class Student extends Member implements IStudent{
    private Teacher teacher;
    private int gradeLevel;
    private int completedHwAssignment;


    public Student( String firstName,
                   String lastName, String address,
                   String city, String userName,
                   String passWord, Teacher teacher,
                   int age, LibraryCard card,String preference, boolean finishedHw) {
        super(firstName, lastName, address, city, userName, passWord, age, card, preference);
        this.teacher = teacher;
        this.gradeLevel = gradeLevel;
    }

    public Teacher getTeacher(){return this.teacher;}
    public int getGrade(){return this.gradeLevel;}
    public int getCompletedHwAssignment(){return this.completedHwAssignment;}

    public void setTeacher(Teacher teacher){this.teacher = teacher;}
    public void setGrade(int gradeLevel){this.gradeLevel = gradeLevel;}
    public void setCompletedHwAssignment(int completedHwAssignment){this.completedHwAssignment = completedHwAssignment;}

    public int completedAssignments(boolean finishedHw){
            return completedHwAssignment += 1;
    }

}
