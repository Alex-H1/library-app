package entity;

import user.User;
import entity.readingmaterial.*;
import java.util.*;
public class Library {
    private String name;
    private String address;
    private List<User> usersList;
    private List<ReadingMaterial> articleList;

    public Library(){
        this.name = "";
        this.address = "";
        this.usersList = new ArrayList<>();
        this.articleList = new ArrayList<>();
    }

    public Library(String name, String address, List<User> userList, List<ReadingMaterial> articleList){
        this.name = name;
        this.address = address;
        this.usersList = userList;
        this.articleList = articleList;
    }



    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public List<User> getUserList(){return this.usersList;}
    public List<ReadingMaterial> getArticleList(){return this.articleList;}

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setUserList(List<User> usersList){
        this.usersList = usersList;
    }
    public void setArticleList(List<ReadingMaterial> articleList){this.articleList = articleList;}
}
