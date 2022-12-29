package enums;

import exceptions.InvalidTypeException;

import java.util.Arrays;
import java.util.Objects;

public enum Grade {
    FIRST(GradeLevel.PRIMARY, 1),
    SECOND(GradeLevel.PRIMARY, 2),
    THIRD(GradeLevel.PRIMARY, 3),
    FOURTH(GradeLevel.PRIMARY, 4),
    FIFTH(GradeLevel.PRIMARY, 5),
    SIXTH(GradeLevel.PRIMARY, 6),
    SEVENTH(GradeLevel.POST_PRIMARY, 7),
    EIGHTH(GradeLevel.POST_PRIMARY, 8),
    NINTH(GradeLevel.SECONDARY, 9),
    TENTH(GradeLevel.SECONDARY, 10),
    ELEVENTH(GradeLevel.SECONDARY, 11),
    TWELFTH(GradeLevel.SECONDARY, 12);

    private GradeLevel educationLevel;
    private int gradeNum;

    Grade(GradeLevel educationLevel, int gradeNum) {
        this.educationLevel = educationLevel;
        this.gradeNum = gradeNum;
    }

    public int getGradeNum() {
        return this.
                gradeNum;
    }

    public GradeLevel getEducationLevel() {
        return this.educationLevel;
    }

    public static Grade gradeLevel(int i) throws InvalidTypeException {
        return Arrays.stream(Grade.values()).filter(grade -> Objects.equals(grade.gradeNum, i)).findFirst().orElseThrow(() -> new InvalidTypeException("student is in college"));

    }


}
