package enums;

public enum Season {
    WINTER("Students and Teachers are out for winter break"),
    SPRING("Have a good rest of the year!"),
    SUMMER("Students and Teachers are out for summer break"),
    FALL("Have a good rest of the year!");
    private String seasonalMessage;

    Season(String seasonalMessage){
        this.seasonalMessage = seasonalMessage;
    }
    public String getSeasonalMessage(){
        return this.seasonalMessage;
    }
}
