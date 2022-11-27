package user.member;
import user.member.Teacher;
public class Student extends Member{
    private Teacher teacher;

    public Student(int userId, String firstName, String lastName, String address, String city, String userName, String passWord, Teacher teacher) {
        super(userId, firstName, lastName, address, city, userName, passWord);
        this.teacher = teacher;
    }
}
