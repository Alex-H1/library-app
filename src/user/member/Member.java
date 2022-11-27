package user.member;
import entity.LibraryCard;
import user.User;

public abstract class Member extends User {
    private LibraryCard libraryCard;
    private int grade;

    public Member(int userId, String firstName, String lastName, String address, String city, String userName, String passWord) {
        super(userId, firstName, lastName, address, city, userName, passWord);
    }
}
