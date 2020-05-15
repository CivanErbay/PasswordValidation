import com.sun.net.httpserver.Authenticator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassVal {

    public static String validation(String password) {


        boolean validLen = password.length() > 5 && password.length() < 30;
        boolean isNumbers =  password.matches(".*\\d.*");
        boolean firstCap = Character.isUpperCase(password.charAt(0));


        List<String> replyList = new ArrayList<>();

        if (!validLen) replyList.add("Passwortlänge ungültig");
        if (!isNumbers) replyList.add("Password muss mindestens eine Nummer enthalten");
        if (!firstCap) replyList.add("Der erste Buchstabe muss ein Großbuchstabe sein");


       return String.join(",", replyList);

    }

    public static boolean validationArray(String password) {

        String[] validPasswords = {"Valid1", "Hausmeister2", "Regenbogen34", "BambusApfel43"};

        boolean validPW = false;

        for (String validPassword : validPasswords) {
            if (password.equals(validPassword)) {
                validPW = true;
                break;
            }
            }
        return validPW;
    }

}

