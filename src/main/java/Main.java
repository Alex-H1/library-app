import entity.CheckOut;
import entity.Genre;
import entity.Library;
import entity.LibraryCard;
import entity.readingmaterial.Book;
import entity.readingmaterial.NewsPaper;
import entity.readingmaterial.ReadingMaterial;
import exceptions.InvalidBookException;
import exceptions.InvalidNameException;
import exceptions.InvalidNumberException;
import exceptions.InvalidTypeException;
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
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static helper.Date.date;
import static helper.RanodomNumGen.randomNumGen;

public class Main {
    public final static Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<User> userList = new HashSet<>();
        Vector<Member> memberList = new Vector<>();
        TreeSet<ReadingMaterial> articleList = new TreeSet<>();
        ArrayDeque<Teacher> teacherList = new ArrayDeque<>();
        HashMap<Student, Integer> studentGradeMap = new HashMap<>();
        Library l = new Library("county library", "123 Seseme St", userList, memberList, articleList, teacherList, studentGradeMap);
        while (true) {
            LOG.info("Library UI");
            if (userList.size() == 0) {
                LOG.info("The Library is closed");
            }
            LOG.info("0) Add User");
            LOG.info("1) See all users");
            LOG.info("2) Add Article");
            LOG.info("3) See all Articles");
            LOG.info("4) checkout Article");
            LOG.info("5) Student Center");
            int num = scan.nextInt();
            try {
                switch (num) {
                    case 0:
                        addUser(l, scan);
                        break;
                    case 1, 3:
                        list(l, num);
                        break;
                    case 2:
                        addArticle(l, scan);
                        break;
                    case 4:
                        checkoutArticle(l, scan);
                        break;
                    case 5:
                        studentMenu(l);
                    default:
                        if (num < 0 || num > 4) {
                            throw new InvalidNumberException("0-4");
                        }
                        scan.close();
                        break;
                }
            } catch (InvalidNumberException e) {
                LOG.error(e);
            }
        }
    }

    public final static void addUser(Library l, Scanner scan) {
        Supplier<Integer> printMenu = () -> {
            LOG.info("Is user a ");
            LOG.info("0) Librarian");
            LOG.info("1) Janitor");
            LOG.info("2) Teacher");
            LOG.info("3) Student");
            return scan.nextInt();
        };
        Predicate<String> fullTimeBool = (s) -> Objects.equals(s, "true");
        String firstName = l.promptFirstname();
        String lastName = l.promptLastname();
        String address = l.promptAddress();
        String city = l.promptCity();
        String userName = l.promptUserName();
        String passWord = l.promptPassWord();
        IntSupplier age = () -> {
            try {
                return l.promptAge();
            } catch (InvalidTypeException e) {
                throw new RuntimeException(e);
            }
        };

        int num2 = printMenu.get();

        if (num2 == 0 || num2 == 1) {
            LOG.info("Is user full-time?");
            LOG.info("Please enter true or false: ");
            scan.nextLine();
            String bool = scan.nextLine().toLowerCase();
            fullTimeBool.test(bool);
        }
        String genre = "science";
        LibraryCard c = new LibraryCard(randomNumGen(), date(), new Librarian("librarian", "librarian"), true);
        ArrayList<ReadingMaterial> checkedOutBooks = new ArrayList<>();
        checkedOutBooks.add(new Book("Green Eggs and Ham", "Dr.Suess", "synopsis", new Genre("childrens book")));
        Teacher t = new Teacher(firstName, lastName, address, city, userName, passWord, 22, "PE", c, genre, checkedOutBooks);
        switch (num2) {
            case 0:
                l.getUserList().add(new Librarian(firstName, lastName, address, city, userName, passWord, age.getAsInt(), randomNumGen(), fullTimeBool, true, genre));
                break;
            case 1:
                l.getUserList().add(new Custodian(true, true, true, randomNumGen(), fullTimeBool, firstName, lastName, address, city, userName, passWord, age.getAsInt(), genre));
                break;
            case 2:

                LOG.info("Department: ");
                scan.nextLine();
                String department = scan.nextLine();
                l.getMemberList().add(new Teacher(firstName, lastName, address, city, userName, passWord, age.getAsInt(), department, c, genre, checkedOutBooks));
                break;
            case 3:
                LOG.info("Grade: ");
                scan.nextLine();
                int grade = scan.nextInt();
                Teacher teacher = new Teacher("miss", "miss");
                Student student = new Student(firstName, lastName, address, city, userName, passWord, teacher, age.getAsInt(), c, genre, grade, checkedOutBooks);
                l.getMemberList().add(student);
                l.getStudentGradeMap().put(student, grade);
        }

    }

    public final static void addArticle(Library l, Scanner scan) {
        String title = l.promptTitle();
        String author = l.promptAuthor();
        String synopsis = l.promptSynopsis();
        LOG.info("is article a ");
        LOG.info("0) A book");
        LOG.info("1)A Newspaper");
        scan.nextLine();
        String num3 = scan.nextLine();

        switch (num3) {
            case "0":
                LOG.info("What genre is the book");
                scan.nextLine();
                String genre = scan.nextLine();
                Genre g = new Genre(genre);
                l.getArticleList().add(new Book(title, author, synopsis, g));
                break;
            case "1":
                LOG.info("Publisher: ");
                scan.nextLine();
                String publisher = scan.nextLine();
                LOG.info("Publish Date");
                int publishDate = Integer.parseInt(scan.nextLine());
                l.getArticleList().add(new NewsPaper(title, author, synopsis, publisher, publishDate));

        }
    }

    public static final void list(Library l, int num) {
        Consumer<Set<?>> displayList = set -> {
            Iterator value = set.iterator();
            while (value.hasNext()) {
                LOG.info(value.next());
            }
        };
        if (num == 1) {
            displayList.accept(l.getUserList());
        } else if (num == 3) {
            displayList.accept(l.getArticleList());
        }
    }

    public static final void checkoutArticle(Library l, Scanner scan) {
        LocalDate articleReturn = date().plusDays(90);
        String title = l.promptArticle();
        scan.nextLine();
        String name = l.promptMember();
        scan.nextLine();
        for (Member m : l.getMemberList()) {
            for (ReadingMaterial r : l.getArticleList()) {
                try {
                    if (Objects.equals(title, r.getTitle()) && Objects.equals(name, m.getFirstName())) {
                        CheckOut c = new CheckOut(date(), articleReturn, m);
                        m.getCheckedOutBooks().add(r);
                    } else if (!(Objects.equals(title, r.getTitle()))) {
                        throw new InvalidBookException("Invalid title");
                    } else if (!(Objects.equals(name, m.getFirstName()))) {
                        throw new InvalidNameException("Invalid name");
                    }
                } catch (InvalidNameException ine) {
                    LOG.error(ine);
                } catch (InvalidBookException ibe) {
                    LOG.error(ibe);
                }
            }
        }
    }

    public static void studentMenu(Library l) {

    }
}


