package user.member;
import entity.LibraryCard;
import user.User;
import user.staff.Librarian;

public abstract class Member extends User {
    private LibraryCard libraryCard;

    public Member(int userId, String firstName, String lastName, String address, String city, String userName, String passWord, int age, LibraryCard libraryCard) {
        super(userId, firstName, lastName, address, city, userName, passWord, age);
        this.libraryCard = libraryCard;

    }
}
