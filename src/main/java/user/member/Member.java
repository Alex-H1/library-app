package user.member;

import entity.LibraryCard;
import entity.readingmaterial.Book;
import entity.readingmaterial.NewsPaper;
import entity.readingmaterial.ReadingMaterial;
import user.User;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Member extends User {
    private LibraryCard card;
    private ArrayList<ReadingMaterial> checkedOutBooks;

    public Member(String firstName,
                  String lastName, String address,
                  String city, String userName,
                  String passWord, int age,
                  LibraryCard card, String preference, ArrayList<ReadingMaterial> checkedOutBooks) {
        super(firstName, lastName, address, city, userName, passWord, age, preference);
        this.card = card;
        this.checkedOutBooks = checkedOutBooks;
    }

    public LibraryCard getCard() {
        return card;
    }
    public ArrayList<ReadingMaterial> getCheckedOutBooks() {
        return this.checkedOutBooks;
    }
    public void setCheckedOutBooks(){
        this.checkedOutBooks = checkedOutBooks;
    }
    public void setCard(LibraryCard card) {
        this.card = card;
    }
}
