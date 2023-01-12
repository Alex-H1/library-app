package enums;

import exceptions.InvalidTypeException;

import java.util.Arrays;

public enum Day {
    MONDAY("monday",false),
    TUESDAY("tuesday",false),
    WEDNESDAY("wednesday",false),
    THURSDAY("thursday",false),
    FRIDAY("friday",false),
    SATURDAY("saturday",true),
    SUNDAY("sunday",true);
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
        return Arrays.stream(Day.values())
                .filter(day -> day.dayByName.equals(s))
                .findFirst()
                .orElseThrow(() -> new InvalidTypeException("Please enter valid day of the week"));
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
