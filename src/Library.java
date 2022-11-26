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

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
