package enums;

public enum Days {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);
   private boolean weekEnd;

    Days(boolean weekEnd) {
        this.weekEnd = weekEnd;
    }
    public boolean getWeekEnd(){
        return this.weekEnd;
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
