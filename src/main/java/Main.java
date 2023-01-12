import entity.CheckOut;
import entity.Genre;
import entity.Library;
import entity.LibraryCard;
import entity.readingmaterial.Book;
import entity.readingmaterial.NewsPaper;
import entity.readingmaterial.ReadingMaterial;
import enums.Day;
import enums.Grade;
import enums.Month;
import enums.User;
import exceptions.InvalidBookException;
import exceptions.InvalidNameException;
import exceptions.InvalidNumberException;
import exceptions.InvalidTypeException;
import interfaces.ICheckout;
import interfaces.IDelete;
import interfaces.ISearch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import user.member.Member;
import user.member.Student;
import user.member.Teacher;
import user.staff.Custodian;
import user.staff.Librarian;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import static helper.Date.date;
import static helper.RandomNumGen.randomNumGen;


public class Main {
    public final static Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashSet<user.User> userList = new HashSet<>();
        Vector<Member> memberList = new Vector<>();
        TreeSet<ReadingMaterial> articleList = new TreeSet<>();
        ArrayDeque<Teacher> teacherList = new ArrayDeque<>();
        HashMap<Integer, Student> studentGradeMap = new HashMap<>();
        Library l = new Library("county library", "123 Seseme St", userList, memberList, articleList, teacherList, studentGradeMap);

        while (true) {
            LOG.info("What day is today? ");
            Function<Day, Integer> checkWeekEnd = (d) -> {
                if (!d.getWeekEnd()) {
                    return 1;
                }
                return null;
            };
            try {
                Day toDay = Day.currentDay(scan.nextLine().toLowerCase());
                checkWeekEnd.apply(toDay);
                LOG.info(toDay.checkDay());
            } catch (InvalidTypeException e) {
                LOG.error(e);
            }
            LOG.info("0) Add User");
            LOG.info("1) See all Users");
            LOG.info("2) Search for User");
            LOG.info("3) See all Teachers");
            LOG.info("4) See all Books");
            LOG.info("5) Remove User");
            LOG.info("6) Add Article");
            LOG.info("7) See all Articles");
            LOG.info("8) Checkout Article(s)");
            LOG.info("9) Student Center");
            LOG.info("10) See student by grade");
            LOG.info("11) Search for book by genre");
            LOG.info("12) View checked out books");
            int num = scan.nextInt();
            try {
                switch (num) {
                    case 0:
                        addUser(l, scan);
                        break;
                    case 1, 3, 4, 7, 10, 11, 12:
                        list(l, num, scan);
                        break;
                    case 2:
                        searchForUser(l, scan);
                        break;
                    case 5:
                        removeUser(l, scan);
                        break;
                    case 6:
                        addArticle(l, scan);
                        break;
                    case 8:
                        checkoutArticle(l, scan);
                        break;
                    case 9:
                        studentCenter(scan);
                        break;
                    default:
                        if (num < 0 || num > 12) {
                            throw new InvalidNumberException("0-12");
                        }
                        scan.close();
                        break;
                }
            } catch (InvalidNumberException | InvalidTypeException e) {
                LOG.error(e);
            }
        }
    }

    private static void studentCenter(Scanner scan) throws InvalidTypeException {

        LOG.info("Enter Current Month");
        try {
            scan.nextLine();
            Month month = Month.getCurrentMonth(scan.nextLine().toLowerCase());
            LOG.info(month.getSeason().getSeasonalMessage());
        } catch (InvalidTypeException ite) {
            LOG.error(ite);
        }

    }

    private static void removeUser(Library l, Scanner scan) {
        IDelete<String> remove = (n) -> {
            if (l.getUserList().contains(n)) {
                l.getUserList().remove(n);
            } else {
                LOG.info("not a user");
            }
        };
        LOG.info("User name: ");
        scan.nextLine();
        remove.delete(scan.nextLine());
    }

    private static void searchForUser(Library l, Scanner scan) {
        ISearch<String> run = (n) -> {
            if (l.getUserList().contains(n)) {
                LOG.info(n + "is at the library");
            } else {
                LOG.info("not a user");
            }
        };
        LOG.info("User name: ");
        scan.nextLine();
        String name = scan.nextLine();
        run.search(name);
    }

    public final static void addUser(Library l, Scanner scan) throws InvalidTypeException {
        Supplier<Integer> printMenu = () -> {
            LOG.info("Is user a ");
            for (User u : User.values()) {
                LOG.info(u.ordinal() + ") " + u);
            }
            return scan.nextInt();
        };
        Predicate<String> isFullTime = (s) -> Objects.equals(s, "true");
        String firstName = l.promptFirstname();
        String lastName = l.promptLastname();
        String address = l.promptAddress();
        String city = l.promptCity();
        String userName = l.promptUserName();
        String passWord = l.promptPassWord();
        String genre = l.promptGenre();
        IntSupplier age = () -> {
            try {
                return l.promptAge();
            } catch (InvalidTypeException e) {
                throw new RuntimeException(e);
            }
        };
        int num2 = printMenu.get();

        if (num2 == 2 || num2 == 3) {
            LOG.info("Is user full-time?");
            LOG.info("Please enter true or false: ");
            scan.nextLine();
            String bool = scan.nextLine().toLowerCase();
            isFullTime.test(bool);
        }
        LibraryCard c = new LibraryCard(randomNumGen(), date(), new Librarian("librarian", "librarian"), true);
        ArrayList<ReadingMaterial> checkedOutBooks = new ArrayList<>();
        Teacher t = new Teacher(firstName, lastName, address, city, userName, passWord, 22, "PE", c, new Genre(genre), checkedOutBooks);
        switch (num2) {
            case 0:
                LOG.info("Grade: ");
                scan.nextLine();
                int grade = scan.nextInt();
                Grade level = Grade.gradeLevel(grade);
                Teacher teacher = new Teacher("Miss", "Misses");
                Student student = new Student(firstName, lastName, address, city, userName, passWord, teacher, age.getAsInt(), c, new Genre(genre), grade, checkedOutBooks);
                LOG.info(level.getEducationLevel().getMessage());
                l.getMemberList().add(student);
                l.getStudentGradeMap().put(grade, student);
                break;
            case 1:
                LOG.info("Department: ");
                scan.nextLine();
                String department = scan.nextLine();
                l.getMemberList().add(new Teacher(firstName, lastName, address, city, userName, passWord, age.getAsInt(), department, c, new Genre(genre), checkedOutBooks));
                break;
            case 2:
                l.getUserList().add(new Custodian(true, true, true, randomNumGen(), isFullTime, firstName, lastName, address, city, userName, passWord, age.getAsInt(),  new Genre(genre)));
                break;
            case 3:
                l.getUserList().add(new Librarian(firstName, lastName, address, city, userName, passWord, age.getAsInt(), randomNumGen(), isFullTime, true, new Genre(genre)));
                break;
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
                break;
        }
    }

    public static final void list(Library l, int num, Scanner scan) {
        Consumer<String> display = s -> {
            LOG.info(s);
        };
        switch (num) {
            case 1:
                l.getUserList().stream().forEach(u -> display.accept(u.getUserName()));
                break;
            case 3:
                l.getArticleList().stream().forEach(r -> display.accept(r.getTitle()));
                break;
            case 4:
                l.getArticleList().stream().filter(r -> r.getGenre() != null).forEach(r -> LOG.info(r));
                break;
            case 7:
                l.getArticleList().stream().filter(r -> r.getGenre() == null).forEach(r -> LOG.info(r));
                break;
            case 10:
                LOG.info("please enter grade: ");
                scan.nextLine();
                int grade = scan.nextInt();
                List<Integer> student = l.getStudentGradeMap().keySet().stream().filter(i -> i == grade).collect(Collectors.toList());
                for (int i : student) {
                    LOG.info(student.get(i));
                }
                break;
            case 11:
                LOG.info("enter genre: ");
                scan.nextLine();
                String genre = scan.nextLine();
                l.getArticleList().stream().filter(r -> r.getGenre().toString() == genre).collect(Collectors.toList()).forEach(r -> LOG.info(r));
                break;
            case 12:
                LOG.info("Please enter name: ");
                scan.nextLine();
                String name = scan.nextLine();
                Member member = l.findUser(name);
                long booksOut = member.getCheckedOutBooks().stream().count();
                LOG.info(booksOut);
                break;
        }
    }

    public static final void checkoutArticle(Library l, Scanner scan) {
        LOG.info("0) add book");
        LOG.info("2) return book");
        scan.nextLine();
        ICheckout<Member, ReadingMaterial> addBook = (m, r) -> {
            m.getCheckedOutBooks().add(r);
            LOG.info("checked out " + r.getTitle());
        };
        ICheckout<Member, ReadingMaterial> returnBook = (m, r) -> {
            m.getCheckedOutBooks().remove(r);
            LOG.info("Book Successfully returned:  " + r.getTitle());
        };
        Function<String, ReadingMaterial> getArtcle = (s) -> {
            Iterator<ReadingMaterial> article = l.getArticleList().iterator();
            while (article.hasNext()) {
                int i = 0;
                if (article.next().getTitle() == s) {
                    return article.next();
                }
                i++;
            }
            return null;
        };
        LocalDate articleReturn = date().plusDays(90);
        String title = l.promptArticle();
        scan.nextLine();
        String name = l.promptMember();
        scan.nextLine();
        int num4 = scan.nextInt();
        Member m = l.findUser(name);
        ReadingMaterial r = getArtcle.apply(title);
        try {
            if (num4 == 0 && l.getUserList().contains(name) && l.getArticleList().contains(title)) {
                CheckOut c = new CheckOut(date(), articleReturn, m);
                addBook.apply(m, r);
                LOG.info("checked out " + r.getTitle());
            }
            if (num4 == 1 && m.getCheckedOutBooks().contains(r)) {
                returnBook.apply(m, r);
                LOG.info("Book Successfully returned:  " + r.getTitle());
            }
            if (!l.getArticleList().contains(title)) {
                throw new InvalidBookException("Invalid title");
            } else if (!l.getUserList().contains(name)) {
                throw new InvalidNameException("Invalid name");
            }
        } catch (InvalidBookException e) {
            LOG.error(e);
        } catch (InvalidNameException e) {
            LOG.error(e);
        }
    }


}


