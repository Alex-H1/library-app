import java.util.*;
import entity.*;
import entity.readingmaterial.*;
import user.*;
import user.member.*;
import user.staff.*;
public class Main {

    public final static void print(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<User> userList = new ArrayList<>();
        List<ReadingMaterial> articleList = new ArrayList<>();
        Library library = new Library("county library", "123 Seseme St", userList, articleList);

//        infiniteloop:
            while (true){
                print("Library UI");
                if (userList.size() == 0){
                    print("The Library is closed");
                }else{
                    for (User u : library.getUserList()){
                        print(u.getFirstName() + " " + u.getLastName() + " are at the library");
                    }
                }
                print("0) Add Member");
                print("1) Edit Member");
                print("2) Add Staff");
                print("3) Edit Staff");
                print("4) Add Book");
                print("5) Edit Book");
                print("6) Add Newspaper");
                print("7) Edit Newspaper");
                print("8) Exit");

                String num = scan.nextLine();
                switch(num){
                    case "0":
                        addMember(library, scan);
                        break;
                    case "1":
                        editMember(library, scan);
                        break;
                    case "2":
                        addStaff(library, scan);
                        break;
                    case "3":
                        editStaff(library, scan);
                        break;
                    case "4":
                        addBook(library, scan);
                        break;
                    case "5":
                        editBook(library, scan);
                        break;
                    case "6":
                        addNewspaper(library, scan);
                        break;
                    case "7":
                        editNewspaper(library, scan);
                        break;
                    default:
                        print("Error pick number 1 - 8");
                }
                scan.close();

            }
    }



    public final static void addMember(Library library, Scanner scan) {
        print("firstname:");
        String firstname = scan.nextLine();
        print("lastname:");
        String lastname = scan.nextLine();
        print("Library Card No:");
        String cardNum = scan.nextLine();

        print("Is member a ");
        print("1) Student");
        print("2) teacher");
        String num2 = scan.nextLine();
        switch(num2){
            case "1":
                print("Teacher: ");
                String teacher = scan.nextLine();
                print("grade: ");
                String grade = scan.nextLine();


        }
    }
    public final static void editMember(Library library, Scanner scan){

    }
    public final static void addStaff(Library library, Scanner scan){

    }
    public final static void editStaff(Library library, Scanner scan){

    }
    public final static void addBook(Library library, Scanner Scan){

    }
    public final static void editBook(Library library, Scanner Scan){

    }
    public final static void addNewspaper(Library library, Scanner scan){

    }
    public final static void editNewspaper(Library library, Scanner Scan){

    }


}