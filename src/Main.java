import java.time.LocalDate;
import java.util.*;
import entity.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import entity.readingmaterial.*;
import user.*;
import user.member.Student;
import user.member.Teacher;
import user.staff.Custodian;
import user.staff.Librarian;

public class Main {

        public final static int randomNumGen(){
            Random rand = new Random(); //instance of random class
            int upperbound = 25;
            //generate random values from 0-24
            return rand.nextInt(upperbound);
        }
        public final  static LocalDate date(){
            LocalDate time = LocalDate.now();
            return time;
        }
        public final static void print(Object o){
        System.out.println(o);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<User> userList = new ArrayList<>();
        List<ReadingMaterial> articleList = new ArrayList<>();
        Library l = new Library("county library", "123 Seseme St", userList, articleList);
        while (true){
           print("Library UI");
            if (userList.size() == 0){
                print("The Library is closed");
            }else{
                for (User u : l.getUserList()){
                    print(u.getFirstName() + " " + u.getLastName() + " are at the library");
                    }
                }
            print("0) Add User");
//            print("1) Edit User");
            print("1) Add Article");
//            print("3) Delete Article");
            String num = scan.nextLine();
            switch(num){
                case "0":
                    addUser(l, scan);
                    break;
//                case "1":
//                    editUser(l, scan);
//                    break;
                case "1":
                    addArticle(l, scan);
                    break;
//                case "3":
//                    deleteArticle(l, scan);
            }
        }
    }
    public final static void addUser(Library l, Scanner scan){
            print("Firstname: ");
            String firstName = scan.nextLine();
            print("Lastname: ");
            String lastName = scan.nextLine();
            print("Address: ");
            String address = scan.nextLine();
            print("City: ");
            String city = scan.nextLine();
            print("Username: ");
            String userName = scan.nextLine();
            print("Password: ");
            String passWord = scan.nextLine();
            print("age: ");
            int age = Integer.parseInt(scan.nextLine());
            print("Favorite Book Genre: ");
            String genre = scan.nextLine();

            print("Is user a ");
            print("0) Librarian");
            print("1) Janitor");
            print("2) Teacher");
            print("3) Student");

            String num2 = scan.nextLine();
            Librarian librarian = new Librarian("placeholder", "placeHolder","placeHolder","placeHolder","placeHolder","placeHolder",56,55,true,true, genre);

        switch (num2){
            case "0":
               l.getUserList().add(new Librarian(firstName, lastName, address, city, userName, passWord, age, randomNumGen(), true, true, genre));
               break;
            case "1":
                l.getUserList().add(new Custodian(true, true, true, randomNumGen(), true, firstName, lastName, address, city, userName, passWord, age, genre));
                break;
            case "2":
                print("Department: ");
                String department = scan.nextLine();
                LibraryCard c = new LibraryCard(randomNumGen(), date(),librarian, true);
                l.getUserList().add(new Teacher(firstName, lastName, address, city, userName, passWord, age, department,  c, genre));
                break;
            case "3":
                print("Grade: ");
                int grade = Integer.parseInt(scan.nextLine());
                LibraryCard s = new LibraryCard(randomNumGen(), date(),librarian, true);
                Teacher teacher = new Teacher("placeHolder", "placeHolder","placeHolder","placeHolder","placeHolder","placeHolder",75,"placeHolder", s,"placeHolder");
                l.getUserList().add(new Student(firstName, lastName, address, city, userName, passWord, teacher, age, s, genre, grade));

        }

    }
    public final static void editUser(Library l, Scanner scan){

    }
    public final static void addArticle(Library l, Scanner scan){
        print("Title: ");
        String title = scan.nextLine();
        print("Author: ");
        String author = scan.nextLine();
        print("Synopsis: ");
        String synopsis = scan.nextLine();
        print("is article a ");
        print("0) A book");
        print("1)A Newspaper");
        String num3 = scan.nextLine();

        switch(num3){
            case "0":
                print("What genre is the book");
                String genre = scan.nextLine();
                Genre g = new Genre(genre);
                l.getArticleList().add(new Book(title, author,synopsis,g));
                break;
            case "1":
                print("Publisher: ");
                String publisher = scan.nextLine();
                print("Publish Date");
                int publishDate = Integer.parseInt(scan.nextLine());
                l.getArticleList().add(new NewsPaper(title,author,synopsis,publisher, publishDate));

        }
    }
    public final static void deleteArticle(Library l, Scanner scan){

    }
}


