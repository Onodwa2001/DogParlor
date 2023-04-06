package za.ac.cput.dogparlor.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public static boolean isNullOrEmpty(String value) {
        return (value.isEmpty() || value.equals("") || value == null);
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    public static boolean isValidCoordinate(String latlong) {
        return (Float.parseFloat(latlong) < -180.0 || Float.parseFloat(latlong) > 180.0);
    }

    public static boolean isValidString(String str){
        Pattern pattern = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
        return (pattern.matcher(str).matches());
    }

}
