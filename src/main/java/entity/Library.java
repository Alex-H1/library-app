package entity;

import entity.readingmaterial.ReadingMaterial;
import exceptions.InvalidTypeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import user.User;
import user.member.Member;
import user.member.Student;
import user.member.Teacher;

import java.util.*;

public class Library {
    private String name;
    private String address;
    private HashSet<User> usersList;
    private TreeSet<ReadingMaterial> articleList;
    private ArrayDeque<Teacher> teacherList;
    private Vector<Member> memberList;
    private HashMap<Integer, Student> studentGradeMap;

    Scanner scan = new Scanner(System.in);

    public final static Logger LOG = LogManager.getLogger(Library.class.getName());


    public Library() {
        this.name = "";
        this.address = "";
        this.usersList = new HashSet<>();
        this.memberList = new Vector<>();
        this.articleList = new TreeSet<>();
        this.teacherList = new ArrayDeque<>();
        this.studentGradeMap = new HashMap<>();
    }

    public Library(String name, String address, HashSet<User> userList, Vector<Member> memberList, TreeSet
            <ReadingMaterial> articleList, ArrayDeque<Teacher> teacherList, HashMap<Integer, Student> studentGradeMap) {
        this.name = name;
        this.address = address;
        this.usersList = userList;
        this.articleList = articleList;
        this.teacherList = teacherList;
        this.memberList = memberList;
        this.studentGradeMap = studentGradeMap;

    }


    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public HashSet<User> getUserList() {
        return this.usersList;
    }

    public TreeSet<ReadingMaterial> getArticleList() {
        return this.articleList;
    }

    public Vector<Member> getMemberList() {
        return this.memberList;
    }

    public ArrayDeque getTeacherList() {
        return this.teacherList;
    }

    public HashMap<Integer, Student> getStudentGradeMap() {
        return this.studentGradeMap;
    }

    public void setTeacherList(ArrayDeque<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void setMemberList(Vector<Member> memberList) {
        this.memberList = memberList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserList(HashSet<User> usersList) {
        this.usersList = usersList;
    }

    public void setArticleList(TreeSet<ReadingMaterial> articleList) {
        this.articleList = articleList;
    }

    public void setStudentGradeMap(HashMap<Integer, Student> studentGradeMap) {
        this.studentGradeMap = studentGradeMap;
    }

    public Member findUser(String s) {
        for(int i = 0; i < memberList.size(); i++){
            if (s == memberList.get(i).getFirstName()) {
                return memberList.get(i);
            }
        }
        return null;
    }

    public String promptFirstname() {
        LOG.info("Firstname: ");
        return scan.nextLine();
    }

    public String promptLastname() {
        LOG.info("Lastname: ");
        return scan.nextLine();
    }

    public String promptAddress() {
        LOG.info("Address: ");
        return scan.nextLine();
    }

    public String promptCity() {
        LOG.info("City: ");
        return scan.nextLine();
    }

    public String promptUserName() {
        LOG.info("Username: ");
        return scan.nextLine();
    }

    public String promptPassWord() {
        LOG.info("Password: ");
        return scan.nextLine();
    }

    public int promptAge() throws InvalidTypeException {
        try {
            LOG.info("age: ");
            return scan.nextInt();
        } catch (InputMismatchException e) {
            throw new InvalidTypeException("should be an integer");
        }
    }

    public String promptTitle() {
        LOG.info("Title: ");
        return scan.nextLine();
    }

    public String promptAuthor() {
        LOG.info("Author: ");
        return scan.nextLine();
    }

    public String promptSynopsis() {
        LOG.info("Synopsis: ");
        return scan.nextLine();
    }

    public String promptArticle() {
        LOG.info("Title of article: ");
        return scan.nextLine();
    }

    public String promptMember() {
        LOG.info("Name of member: ");
        return scan.nextLine();
    }

    public String promptGenre() {
        LOG.info("Favorite genre: ");
        return scan.nextLine();
    }

}
