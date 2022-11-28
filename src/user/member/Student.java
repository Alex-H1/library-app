package user.member;
import entity.LibraryCard;

public final class Student extends Member implements IStudent{
    private Teacher teacher;
    private int gradeLevel;
    private boolean finishedHw;
    private int completedHwAssignment;


    public Student( String firstName,
                   String lastName, String address,
                   String city, String userName,
                   String passWord, Teacher teacher,
                   int age, LibraryCard card,String preference, boolean finishedHw) {
        super(firstName, lastName, address, city, userName, passWord, age, card, preference);
        this.teacher = teacher;
        this.gradeLevel = gradeLevel;
        this.finishedHw = finishedHw;
    }

    public Teacher getTeacher(){return this.teacher;}
    public int getGrade(){return this.gradeLevel;}
    public boolean getFinishedHw(){return this.finishedHw;}
    public int getCompletedHwAssignment(){return this.completedHwAssignment;}

    public void setTeacher(Teacher teacher){this.teacher = teacher;}
    public void setGrade(int gradeLevel){this.gradeLevel = gradeLevel;}
    public void setFinishedHw(boolean finishedHw){this.finishedHw = finishedHw;}
    public void setCompletedHwAssignment(int completedHwAssignment){this.completedHwAssignment = completedHwAssignment;}

    public int completedAssignments(boolean finishedHw){
        if(finishedHw == true){
            return completedHwAssignment += 1;
        }
        return completedHwAssignment;
    }

}
