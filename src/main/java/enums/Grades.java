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
