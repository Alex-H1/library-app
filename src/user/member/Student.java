package user.member;
import entity.LibraryCard;

public class Student extends Member{
    private Teacher teacher;
    private int grade;


    public Student(int userId, String firstName,
                   String lastName, String address,
                   String city, String userName,
                   String passWord, Teacher teacher,
                   int age, LibraryCard card) {
        super(userId, firstName, lastName, address, city, userName, passWord, age, card);
        this.teacher = teacher;
        this.grade = grade;
    }

    @Override
    public int birthDate(int age) {
        return age += 1;
    }


}
