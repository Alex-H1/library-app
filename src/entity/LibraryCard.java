package entity;

import user.member.Member;
import user.staff.Librarian;

public class LibraryCard implements ILibraryCard{
    private static int id;
    private int issueDate;
    private Librarian issuer;
    private boolean active;
//    private Member owner;
//    private int booksCheckedOut;

    public LibraryCard(int id, int issueDate, Librarian issuer, boolean active) {
        this.id = id;
        this.issueDate = issueDate;
        this.issuer = issuer;
        this.active = active;

    }


    public int getId() {
       return this.id;
    }
    public int getIssueDate(){
        return this.issueDate;
    }
    public boolean getActive(){
        return this.active;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setIssueDate(int issueDate){
        this.issueDate = issueDate;
    }
    public void setActive(boolean active){
        this.active = active;
    }

    public boolean cancelCard(boolean active){
        return this.active = false;
    }


}
