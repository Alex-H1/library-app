package user.member;

public class Teacher extends Member{
    private String department;

    public Teacher(int userId, String firstName, String lastName, String address, String city, String userName, String passWord, int age, String department){
        super(userId, firstName, lastName, address, city,userName, passWord, age);
        this.department = department;
    }

    public String getDepartment(){return this.department;}

    public void setDepartment(String department){this.department = department;}
    @Override
    public int birthDate(int age) {
        return age += 1;
    }
}
