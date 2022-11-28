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
                print("0) Add User");
                print("1) Edit User");
                print("2) Delete User");
                print("3) Add Book");
                print("4) Edit Book");
                print("5) Delete Book");
                print("6) Add Newspaper");
                print("7) Edit Newspaper");
                print("8) delete Newspaper");



            }



    }
}