package user;

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String userName;
    private String passWord;

    public User(int userId, String firstName,
                String lastName, String address,
                String city, String userName, String passWord ){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.userName = userName;
        this.passWord = passWord;

    }

    public int getUserId(){
        return this.userId;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCity(){
        return this.city;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getPassWord(){
        return this.passWord;
    }


}
