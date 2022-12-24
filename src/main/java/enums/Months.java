package enums;

import exceptions.InvalidTypeException;

public enum Months {
    JANUARY(Seasons.WINTER),
    FEBRUARY(Seasons.SPRING),
    MARCH(Seasons.SPRING),
    APRIL(Seasons.SPRING),
    MAY(Seasons.SPRING),
    JUNE(Seasons.SUMMER),
    JULY(Seasons.SUMMER),
    AUGUST(Seasons.SUMMER),
    SEPTEMBER(Seasons.FALL),
    OCTOBER(Seasons.FALL),
    NOVEMBER(Seasons.FALL),
    DECEMBER(Seasons.WINTER);


    private Seasons season;

    Months(Seasons season) {
        this.season = season;
    }

    public Seasons getSeason() {
        return this.season;
    }


    public static Months currentMonth(String s) throws InvalidTypeException {
        switch (s) {
            case "january":
                return Months.JANUARY;
            case "february":
                return Months.FEBRUARY;
            case "march":
                return Months.MARCH;
            case "april":
                return Months.APRIL;
            case "may":
                return Months.MAY;
            case "june":
                return Months.JUNE;
            case "july":
                return Months.JULY;
            case "august":
                return Months.AUGUST;
            case "september":
                return Months.SEPTEMBER;
            case "october":
                return Months.OCTOBER;
            case "november":
                return Months.NOVEMBER;
            case "december":
                return Months.DECEMBER;
            default:
                throw new InvalidTypeException("Please enter valid month");
        }
    }

    public String seasonMessage() {
        switch (this.season) {
            case WINTER:
                return "Students and Teachers are out for winter break";
            case SUMMER:
                return "Students and Teachers are out for summer break";
            default:
                return "Have a good rest of the year!";
        }
    }
}

