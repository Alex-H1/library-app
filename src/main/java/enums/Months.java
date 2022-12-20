package enums;

import java.lang.management.MemoryPoolMXBean;
import java.util.function.Function;

public enum Months {
    JANUARY("Winter"),
    FEBRUARY("Spring"),
    MARCH("Spring"),
    APRIL("Spring"),
    MAY("spring"),
    JUNE("Summer"),
    JULY("Summer"),
    AUGUST("Summer"),
    SEPTEMBER("Fall"),
    OCTOBER("Fall"),
    NOVEMBER("Winter"),
    DECEMBER("Winter");


    private final String season;

    Months(String season) {
        this.season = season;
    }
    public String getSeason(){
        return this.season;
    }
}
