package entity;

public class Library {
    private String name;
    private String address;
//    private list<Users>;
//    private list<PrintedPublication>
//    private link<Reservations>;

    public Library(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String setName(){
        return this.name;
    }
    public String setAddress(){
        return this.address;
    }

    public void getName(String name){
        this.name = name;
    }
    public void getAddress(String address){
        this.address = address;
    }
}
