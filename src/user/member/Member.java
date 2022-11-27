package user.member;
import entity.LibraryCard;
import user.User;

public class Member extends User {
    private LibraryCard card;

    public Member(int userId, String firstName,
                  String lastName, String address,
                  String city, String userName,
                  String passWord, int age,
                  LibraryCard card) {
        super(userId, firstName, lastName, address, city, userName, passWord, age);
        this.card = card;

    }

    public entity.LibraryCard getCard() {
        return card;
    }

    public void setCard(LibraryCard card){
        this.card = card;
    }

    @Override
    public int birthDate(int age) {
        return age += 1;
    }
}
