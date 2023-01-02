package enums;

import exceptions.InvalidTypeException;

import java.util.Arrays;

public enum Month {
    JANUARY("january",Season.WINTER),
    FEBRUARY("february",Season.SPRING),
    MARCH("march",Season.SPRING),
    APRIL("april",Season.SPRING),
    MAY("may",Season.SPRING),
    JUNE("june",Season.SUMMER),
    JULY("july",Season.SUMMER),
    AUGUST("august",Season.SUMMER),
    SEPTEMBER("september",Season.FALL),
    OCTOBER("october",Season.FALL),
    NOVEMBER("november",Season.FALL),
    DECEMBER("december",Season.WINTER);


    private Season season;
    private String monthName;

    Month(String monthName ,Season season) {
        this.season = season;
        this.monthName = monthName;
    }

    public Season getSeason() {
        return this.season;
    }
    public String getMonthByName(){
        return this.monthName;
    }

    public static Month getCurrentMonth(String s) throws InvalidTypeException {
        return Arrays.stream(Month.values())
                .filter(month -> month.monthName.equals(s))
                .findFirst()
        .orElseThrow(() -> new InvalidTypeException("Please enter valid day of the month"));
    }

}

