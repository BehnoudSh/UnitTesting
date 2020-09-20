package ir.navaco.unittest.Tools;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper_Validation {

//    public enum INPUT_STATE {EMPTY, INVALID, VALID}

    static Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                    Pattern.CASE_INSENSITIVE);

    public static boolean Valid_Email(String email) {
//        if (TextUtils.isEmpty(email))
//            return false;
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if (matcher.find())
            return true;
        return false;
    }


}
