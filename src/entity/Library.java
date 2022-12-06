package entity;

import entity.readingmaterial.ReadingMaterial;
import exceptions.InvalidTypeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import user.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Library {
    private String name;
    private String address;
    private List<User> usersList;
    private List<ReadingMaterial> articleList;

    Scanner scan = new Scanner(System.in);

    public final static Logger log = LogManager.getLogger(Library.class.getName());


    public Library() {
        this.name = "";
        this.address = "";
        this.usersList = new ArrayList<>();
        this.articleList = new ArrayList<>();
    }

    public Library(String name, String address, List<User> userList, List<ReadingMaterial> articleList) {
        this.name = name;
        this.address = address;
        this.usersList = userList;
        this.articleList = articleList;
    }


    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public List<User> getUserList() {
        return this.usersList;
    }

    public List<ReadingMaterial> getArticleList() {
        return this.articleList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserList(List<User> usersList) {
        this.usersList = usersList;
    }

    public void setArticleList(List<ReadingMaterial> articleList) {
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
