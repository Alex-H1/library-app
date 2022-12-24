package enums;

import exceptions.InvalidTypeException;

public enum Day {
    MONDAY("Monday",false),
    TUESDAY("Tuesday",false),
    WEDNESDAY("Wednesday",false),
    THURSDAY("Thursday",false),
    FRIDAY("Friday",false),
    SATURDAY("Saturday",true),
    SUNDAY("Sunday",true);
   private boolean weekEnd;
   private String dayByName;

    Day(String dayByName, boolean weekEnd) {
        this.weekEnd = weekEnd;
        this.dayByName = dayByName;
    }
    public boolean getWeekEnd(){
        return this.weekEnd;
    }
    public String getDayByName(){ return this.dayByName;}

    public static Day currentDay(String s) throws InvalidTypeException {
        return switch (s) {
            case "monday" -> Day.MONDAY;
            case "tuesday" -> Day.TUESDAY;
            case "wednesday" -> Day.WEDNESDAY;
            case "thursday" -> Day.THURSDAY;
            case "friday" -> Day.FRIDAY;
            case "saturday" -> Day.SATURDAY;
            case "sunday" -> Day.SUNDAY;
            default -> throw new InvalidTypeException("Please enter valid day of the week");
        };
    }
    public String checkDay(){
        switch(this){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> {
               return  "welcome to the Library";
            }
            case FRIDAY -> {
                return "Happy Friday";
            }
            case SATURDAY, SUNDAY -> {
                return "Library Closed";
            }
        }
        return null;
    }
}
