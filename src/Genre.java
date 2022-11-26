public class Genre {
    private String name;
    private String description;

    public Genre(String name, String description){
        this.description = description;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(){
        this.description = description;
    }

}
