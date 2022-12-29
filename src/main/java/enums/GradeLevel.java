package enums;

public enum GradeLevel {
    PRIMARY("Has one class"),
    POST_PRIMARY("Has more than one class"),
    SECONDARY("Has more than one class");

    private String message;

    GradeLevel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
