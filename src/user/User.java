package user;

public abstract class User implements IUser{
    private int userId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String userName;
    private String passWord;
    private int age;

    public User(int userId, String firstName,
                String lastName, String address,
                String city, String userName, String passWord, int age) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
    }

    public int setUserId(){
        return this.userId;
    }
    public String setFirstName(){
        return this.firstName;
    }
    public String setLastName(){
        return this.lastName;
    }
    public String setAddress(){
        return this.address;
    }
    public String setCity(){
        return this.city;
    }
    public String setUserName(){
        return this.userName;
    }
    public int setAge(){return this.age;}

    public void getUserId(int userId){this.userId = userId;}
    public void getFirstName(String firstName){this.firstName = firstName;}
    public void getLastName (String lastName){this.lastName = lastName;}
    public void getAddress(String address){this.address = address;}
    public void getCity(String city){this.city = city;}
    public void getUserName(String userName){this.userName = userName;}
    public void getAge(int age){this.age = age;}


}
