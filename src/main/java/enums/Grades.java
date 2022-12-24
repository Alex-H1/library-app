package enums;

public enum Grades {
    FIRST(GradeLevel.PRIMARY),
    SECOND(GradeLevel.PRIMARY),
    THIRD(GradeLevel.PRIMARY),
    FOURTH(GradeLevel.PRIMARY),
    FIFTH(GradeLevel.PRIMARY),
    SIXTH(GradeLevel.PRIMARY),
    SEVENTH(GradeLevel.POST_PRIMARY),
    EIGHTH(GradeLevel.POST_PRIMARY),
    NINTH(GradeLevel.SECONDARY),
    TENTH(GradeLevel.SECONDARY),
    ELEVENTH(GradeLevel.SECONDARY),
    TWELFTH(GradeLevel.SECONDARY);

    private GradeLevel educationLevel;
    Grades(GradeLevel educationLevel) {
    this.educationLevel = educationLevel;
    }

    public static Grades gradeLevel(int i){
        switch (i) {
            case 1 -> {
                return Grades.FIRST;
            }
            case 2 -> {
                return Grades.SECOND;
            }
            case 3 -> {
                return Grades.THIRD;
            }
            case 4 -> {
                return Grades.FOURTH;
            }
            case 5 -> {
                return Grades.FIFTH;
            }
            case 6 -> {
                return Grades.SIXTH;
            }
            case 7 -> {
                return Grades.SEVENTH;
            }
            case 8 -> {
                return Grades.EIGHTH;
            }
            case 9 -> {
                return Grades.NINTH;
            }
            case 10 -> {
                return Grades.TENTH;
            }
            case 11 -> {
                return Grades.ELEVENTH;
            }
            case 12 -> {
                return Grades.TWELFTH;
            }
        }
        return null;
    }
    public String hasClasses(){
        switch(this.educationLevel) {
            case PRIMARY:
                return "Has one class";
            case POST_PRIMARY:
            case SECONDARY:
                return "Has more than one class";

        }
        return null;
    }

}
