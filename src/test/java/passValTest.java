import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passValTest {

    @Test
    public void isPasswordValid() {
        //GIVEN
        String PassCheck = "TestPW23";
        //WHEN
        String result = PassVal.validation(PassCheck);
        //THEN
        assertEquals("Password valid", result);

    }

    @Test
    public void isPasswordInvalid() {
        //GIVEN
        String PassCheck = "test";
        //WHEN
        String result = PassVal.validation(PassCheck);
        //THEN
        assertEquals("Password invalid", result);
    }

    @Test
    public void arrayCheck() {
        //GIVEN
        String[] PassCheck = {"Valid1", "Hausmeister44", "Vogel3Nest", "AffenKäfig45"};
        //WHEN
        for (String s : PassCheck) {
            String result = PassVal.validation(s);
            assertEquals("Password valid", result);
        }
    }

    @Test
    public void dataBaseCheck() {
        //GIVEN
        String testPW = "Regenbogen34";
        //WHEN
        boolean result = PassVal.validationArray(testPW);
        //THEN
        assertTrue(result);
    }

    @Test
    public void invalidLength() {
        //GIVEN
        String testPW = "Re3";
        //WHEN
        String result = PassVal.validation(testPW);
        //THEN
        assertEquals("Passwortlänge ungültig", result);
    }

    @Test
    public void invalidLengthAndMissingNumbers() {
        //GIVEN
        String testPW = "Ree";
        //WHEN
        String result = PassVal.validation(testPW);
        //THEN
        assertEquals("Passwortlänge ungültig,Password muss mindestens eine Nummer enthalten", result);
    }

    @Test
    public void invalidLengthAndMissingNumbersAndCapital() {
        //GIVEN
        String testPW = "ree";
        //WHEN
        String result = PassVal.validation(testPW);
        //THEN
        assertEquals("Passwortlänge ungültig,Password muss mindestens eine Nummer enthalten,Der erste Buchstabe muss ein Großbuchstabe sein", result);
    }


}