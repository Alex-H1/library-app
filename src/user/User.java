package user;

public abstract class User implements IUser{
    private int userId;
    private static String firstName;
    private static String lastName;
    private String address;
    private String city;
    private String userName;
    private final String passWord;
    private int age;
    private String preference;

    public User(int userId, String firstName,
                String lastName, String address,
                String city, String userName, String passWord,
                int age, String preference) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
        this.preference = preference;
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
    public int getAge(){return this.age;}

    public void setUserId(int userId){this.userId = userId;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName (String lastName){this.lastName = lastName;}
    public void setAddress(String address){this.address = address;}
    public void setCity(String city){this.city = city;}
    public void setUserName(String userName){this.userName = userName;}
    public void setAge(int age){this.age = age;}

    public final int birthDate(int age){return age += 1;}

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof User)){
            return false;
        }

        User user = (User) o;

        boolean preferenceEquals = (this.preference == null && user.preference == null) ||
                (this.preference != null && this.preference.equals(user.preference));
        return this.preference == user.preference && preferenceEquals;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (int) getAge();
        hash = 31 * hash + (preference == null ? 0 : preference.hashCode());
        hash = 31 * hash + (preference == null ? 0 : preference.hashCode());
        return hash;
    }

}
