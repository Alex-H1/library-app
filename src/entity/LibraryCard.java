package entity;

import user.staff.Librarian;

import java.time.LocalDate;

public class LibraryCard implements ILibraryCard {
    private static int id;
    private LocalDate issueDate;
    private final Librarian issuer;
    private boolean active;
//    private Member owner;
//    private int booksCheckedOut;

    public LibraryCard(int id, LocalDate issueDate, Librarian issuer, boolean active) {
        LibraryCard.id = id;
        this.issueDate = issueDate;
        this.issuer = issuer;
        this.active = active;

    }


    public int getId() {
        return id;
    }

    public LocalDate getIssueDate() {
        return this.issueDate;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setId(int id) {
        LibraryCard.id = id;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean cancelCard(boolean active) {
        return this.active = false;
    }


}
