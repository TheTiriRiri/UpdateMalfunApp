package miscellaneous;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateNow {

    private static String getCurrentTimeString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        return dateFormat.format(new DateNow());
    }
}
