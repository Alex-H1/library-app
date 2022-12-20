package enums;

public enum Grades {
    FIRST("Primary"),
    SECOND("Primary"),
    THIRD("Primary"),
    FOURTH("Primary"),
    FIFTH("Primary"),
    SIXTH("Primary"),
    SEVENTH("Post-Primary"),
    EIGHTH("Post-Primary"),
    NINTH("Secondary"),
    TENTH("Secondary"),
    ELEVENTH("Secondary"),
    TWELFTH("Secondary");

    private String educationLevel;
//change level to enum
    Grades(String educationLevel) {
    this.educationLevel = educationLevel;
    }
    public String hasClasses(){
        switch(this.educationLevel) {
            case "Primary":
                return "Has one class";
            case "Secondary":
            case "Post-Primary":
                return "Has more than one class";

        }
        return null;
    }

}
