package user.member;
import entity.Library;
import entity.LibraryCard;
import user.User;

import java.util.List;

public class Member extends User {
    private LibraryCard card;
    public Member(String firstName,
                  String lastName, String address,
                  String city, String userName,
                  String passWord, int age,
                  LibraryCard card, String preference) {
        super(firstName, lastName, address, city, userName, passWord, age, preference);
        this.card = card;
//        this.teacherList = teacherList;

    }

    public LibraryCard getCard() {
        return card;
    }

//    public List<Teacher> getTeacherList() {
//        return teacherList;
//    }

//    public void  setTeacherList(List<Teacher> teacherList){ this.teacherList = teacherList;}
    public void setCard(LibraryCard card){
        this.card = card;
    }

}
