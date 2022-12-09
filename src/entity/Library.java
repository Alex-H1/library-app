package entity;

import entity.readingmaterial.ReadingMaterial;
import exceptions.InvalidTypeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import user.User;
import user.member.Member;
import user.member.Teacher;

import java.util.*;

public class Library {
    private String name;
    private String address;
    private ArrayList<User> usersList;
    private ArrayList<ReadingMaterial> articleList;
    private ArrayDeque<Teacher> teacherList;
    private ArrayList<Member> memberList;
    Scanner scan = new Scanner(System.in);

    public final static Logger log = LogManager.getLogger(Library.class.getName());


    public Library() {
        this.name = "";
        this.address = "";
        this.usersList = new ArrayList<>();
        this.memberList = new ArrayList<>();
        this.articleList = new ArrayList<>();
        this.teacherList = new ArrayDeque<>();
    }

    public Library(String name, String address, ArrayList<User> userList, ArrayList<Member> memberList,ArrayList<ReadingMaterial> articleList,ArrayDeque<Teacher> teacherList) {
        this.name = name;
        this.address = address;
        this.usersList = userList;
        this.articleList = articleList;
        this.teacherList = teacherList;
        this.memberList = memberList;
    }


    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public ArrayList<User> getUserList() {
        return this.usersList;
    }

    public ArrayList<ReadingMaterial> getArticleList() {
        return this.articleList;
    }
    public ArrayList<Member> getMemberList(){ return this.memberList;}
    public ArrayDeque getTeacherList(){ return this.teacherList; }
    public void setTeacherList(ArrayDeque<Teacher> teacherList){ this.teacherList = teacherList; }
    public void setMemberList(ArrayList<Member> memberList){ this.memberList = memberList; }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public void setArticleList(ArrayList<ReadingMaterial> articleList) {
        this.articleList = articleList;
    }

    public String promptFirstname(){
        log.info("Firstname: ");
        return scan.nextLine();
    }
    public String promptLastname(){
        log.info("Lastname: ");
        return scan.nextLine();
    }
    public String promptAddress(){
        log.info("Address: ");
        return scan.nextLine();
    }
    public String promptCity(){
        log.info("City: ");
        return scan.nextLine();
    }
    public String promptUserName(){
        log.info("Username: ");
        return scan.nextLine();
    }
    public String promptPassWord(){
        log.info("Password: ");
        return scan.nextLine();
    }
    public int promptAge() throws InvalidTypeException {
        try {
            log.info("age: ");
            return scan.nextInt();
        } catch (InputMismatchException e){
            throw new InvalidTypeException("should be an integer");
        }
    }
    public String promptTitle(){
        log.info("Title: ");
        return scan.nextLine();
    }
    public String promptAuthor(){
        log.info("Author: ");
        return scan.nextLine();
    }
    public String promptSynopsis(){
        log.info("Synopsis: ");
        return scan.nextLine();
    }

    public String promptArticle(){
        log.info("Title of article: ");
        return scan.nextLine();
    }
    public String promptMember(){
        log.info("Name of member: ");
        return scan.nextLine();
    }

}
