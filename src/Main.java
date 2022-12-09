import entity.CheckOut;
import entity.Genre;
import entity.Library;
import entity.LibraryCard;
import entity.readingmaterial.Book;
import entity.readingmaterial.NewsPaper;
import entity.readingmaterial.ReadingMaterial;
import exceptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import user.User;
import user.member.Member;
import user.member.Student;
import user.member.Teacher;
import user.staff.Custodian;
import user.staff.Librarian;

import java.time.LocalDate;
import java.util.*;

import static helper.Date.date;
import static helper.RanodomNumGen.randomNumGen;

public class Main {

    public final static Logger log = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) throws InvalidNumberException, InvalidTypeException, InvalidBooleanException {
        Scanner scan = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();
        ArrayList<Member> memberList = new ArrayList<>();
        ArrayList<ReadingMaterial> articleList = new ArrayList<>();
        ArrayDeque<Teacher> teacherList = new ArrayDeque<>();
        Library l = new Library("county library", "123 Seseme St", userList, memberList, articleList, teacherList);
        while (true) {
            log.info("Library UI");
            if (userList.size() == 0) {
                log.info("The Library is closed");
            }
                log.info("0) Add User");
                log.info("1) See all users");
                log.info("2) Add Article");
                log.info("3) See all Articles");
                log.info("4) checkout Article");
                int num = 0;
                try{
                  num = scan.nextInt();
                  if(num < 0 || num > 4){
                      throw new InvalidNumberException("0-4");
                  }
                } catch (InvalidNumberException e){
                    log.error(e);
                }


            switch (num) {
                case 0:
                    addUser(l, scan);
                    break;
                case 1:
                    getUsers(l);
                    break;
                case 2:
                    addArticle(l, scan);
                    break;
                case 3:
                    getArticles(l);
                    break;
                case 4:
                    checkoutArticle(l,scan);
                    break;
            }
        }
    }

    public final static int printMenu(Scanner scan){
        log.info("Is user a ");
        log.info("0) Librarian");
        log.info("1) Janitor");
        log.info("2) Teacher");
        log.info("3) Student");
        return scan.nextInt();
    }

    public final static void addUser(Library l, Scanner scan) throws InvalidTypeException, InvalidBooleanException {
        String firstName = l.promptFirstname();
        String lastName = l.promptLastname();
        String address = l.promptAddress();
        String city = l.promptCity();
        String userName = l.promptUserName();
        String passWord = l.promptPassWord();
        int age = 0;
        try{
            age = l.promptAge();

        } catch (InvalidTypeException e) {
            log.error(e);
        }
        int num2 = printMenu(scan);

        boolean fullTimeBool = false;
        if(num2 == 0 || num2 == 1){
            log.info("Is user fulltime?");
            log.info("0) true");
            log.info("1) false");
            try {
                int fullTime = scan.nextInt();
                if (fullTime == 0) {
                    fullTimeBool = true;
                } else if (fullTime == 1) {
                    fullTimeBool = false;
                } else {
                    throw new InvalidBooleanException("please enter 0 or 1");
                }
            }catch (InvalidBooleanException IBE){
                log.error(IBE);
            }
        }
        String genre = "science";
        Librarian librarian = new Librarian("placeholder", "placeHolder", "placeHolder", "placeHolder", "placeHolder", "placeHolder", 56, 55, true, true, genre);
        LibraryCard c = new LibraryCard(randomNumGen(), date(), librarian, true);
        ArrayDeque<ReadingMaterial> checkedOutBooks = null;
        checkedOutBooks.add(new Book("Green Eggs and Ham", "Dr.Suess","synopsis", new Genre("childrens book")));
        Teacher t = new Teacher(firstName, lastName, address, city, userName, passWord, 22, "PE",c, genre,checkedOutBooks );
        switch (num2) {
            case 0:
                l.getUserList().add(new Librarian(firstName, lastName, address, city, userName, passWord, age, randomNumGen(), fullTimeBool, true, genre));
                break;
            case 1:
                l.getUserList().add(new Custodian(true, true, true, randomNumGen(), fullTimeBool, firstName, lastName, address, city, userName, passWord, age, genre));
                break;
            case 2:

                log.info("Department: ");
                String department = scan.nextLine();
                l.getMemberList().add(new Teacher(firstName, lastName, address, city, userName, passWord, age, department, c, genre, checkedOutBooks));
                break;
            case 3:
                log.info("Grade: ");
                int grade = scan.nextInt();
                LibraryCard s = new LibraryCard(randomNumGen(), date(), librarian, true);
                Teacher teacher = new Teacher("placeHolder", "placeHolder", "placeHolder", "placeHolder", "placeHolder", "placeHolder", 75, "placeHolder", s, "placeHolder", null);

                l.getMemberList().add(new Student(firstName, lastName, address, city, userName, passWord, teacher, age, s, genre, grade, checkedOutBooks));

        }

    }

    public final static void addArticle(Library l, Scanner scan) {
        String title = l.promptTitle();
        String author = l.promptAuthor();
        String synopsis = l.promptSynopsis();
        log.info("is article a ");
        log.info("0) A book");
        log.info("1)A Newspaper");
        String num3 = scan.nextLine();

        switch (num3) {
            case "0":
                log.info("What genre is the book");
                String genre = scan.nextLine();
                Genre g = new Genre(genre);
                l.getArticleList().add(new Book(title, author, synopsis, g));
                break;
            case "1":
                log.info("Publisher: ");
                String publisher = scan.nextLine();
                log.info("Publish Date");
                int publishDate = Integer.parseInt(scan.nextLine());
                l.getArticleList().add(new NewsPaper(title, author, synopsis, publisher, publishDate));

        }
    }

    public static final void getUsers(Library l){
        for (User u : l.getUserList()) {
            log.info(u.getFirstName() + " " + u.getLastName() + " are at the library");
        }
    }

    public static final void getArticles(Library l){
        for (ReadingMaterial r : l.getArticleList()) {
            log.info(r.getTitle() + " by " + r.getAuthor());
        }
    }

    public static final void checkoutArticle(Library l, Scanner scan){
        LocalDate articleReturn = date().plusDays(90);
       String title = l.promptArticle();
       String name = l.promptMember();
        for (Member m : l.getMemberList()) {
            for (ReadingMaterial r : l.getArticleList()) {
                try {
                    if (Objects.equals(title, r.getTitle()) && Objects.equals(name, m.getFirstName())) {
                        CheckOut c = new CheckOut(date(), articleReturn, m);
                        m.getCheckedOutBooks().add(r);
                    } else if(!(Objects.equals(title, r.getTitle()))){
                        throw new InvalidBookException("Invalid title");
                    }else if(!(Objects.equals(name, m.getFirstName()))){
                        throw new InvalidNameException("Invalid name");
                    }
                } catch (InvalidNameException INE) {
                    log.error(INE);
                } catch (InvalidBookException IBE) {
                    log.error(IBE);
                }
            }
        }
    }
}


