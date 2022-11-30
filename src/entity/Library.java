package entity;

import entity.readingmaterial.ReadingMaterial;
import user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private String name;
    private String address;
    private List<User> usersList;
    private List<ReadingMaterial> articleList;

    Scanner scan = new Scanner(System.in);

    public static void print(Object o) {
        System.out.println(o);
    }

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
        print("Firstname: ");
        return scan.nextLine();
    }
    public String promptLastname(){
        print("Lastname: ");
        return scan.nextLine();
    }
    public String promptAddress(){
        print("Address: ");
        return scan.nextLine();
    }
    public String promptCity(){
        print("City: ");
        return scan.nextLine();
    }
    public String promptUserName(){
        print("Username: ");
        return scan.nextLine();
    }
    public String promptPassWord(){
        print("Password: ");
        return scan.nextLine();
    }
    public int promptAge(){
        print("age: ");
        return scan.nextInt();
    }
    public String promptGenre(){
        print("Favorite Book Genre: ");
        return scan.nextLine();
    }

    public String propmtTitle(){
        print("Title: ");
        return scan.nextLine();
    }
    public String promptAuthor(){
        print("Author: ");
        return scan.nextLine();
    }
    public String promptSynopsis(){
        print("Synopsis: ");
        return scan.nextLine();
    }

}
