package ud1.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DebugIfTest {

    @Test
    void gradeAllNoSuperat() {
        assertEquals("No superat", DebugIf.grade(3, 3));
    }
    @Test
    void gradePracticesNoSuperat() {
        assertEquals("No superat", DebugIf.grade(3, 10));
    }
    @Test
    void gradePracticesNoSuperat2() {
        assertEquals("No superat", DebugIf.grade(4, 6));
    }
    @Test
    void gradeExamNoSuperat () {
        assertEquals("No superat", DebugIf.grade(10, 3));
    }
    @Test
    void gradeExamLlindarNoSuperat () {
        assertEquals("No superat", DebugIf.grade(6.1, 3.9));
    }
    @Test
    void gradeTotalLlindarSuperat () {
        assertEquals("Superat", DebugIf.grade(5.1, 4.9));
    }
    @Test
    void gradeExamLlindarSuperat () {
        assertEquals("Superat", DebugIf.grade(7, 3.9));
    }
    @Test
    void gradePracticesLlindarSuperat () {
        assertEquals("Superat", DebugIf.grade(4.75, 8));
    }
    @Test
    void gradeExamSuperat () {
        assertEquals("Superat", DebugIf.grade(7, 4));
    }
    @Test
    void gradeExcelent () {
        assertEquals("Excel·lent", DebugIf.grade(10, 10));
    }
    @Test
    void gradeNotable () {
        assertEquals("Notable", DebugIf.grade(8, 8));
    }
}