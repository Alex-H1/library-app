package user.member;
import entity.LibraryCard;
import user.User;

public class Member extends User {
    private LibraryCard card;

    public Member( String firstName,
                  String lastName, String address,
                  String city, String userName,
                  String passWord, int age,
                  LibraryCard card, String preference) {
        super(firstName, lastName, address, city, userName, passWord, age, preference);
        this.card = card;

    }

    public LibraryCard getCard() {
        return card;
    }

    public void setCard(LibraryCard card){
        this.card = card;
    }

}
