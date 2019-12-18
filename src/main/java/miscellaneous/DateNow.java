package miscellaneous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {

    public static void getCurrentDateTimeStartString() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }

    public static void getCurrentDateTimeEndString() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }

    public static void getCurrentDateTimeString() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy_MM_dd_HHmm");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }

    public static void getCurrentDateString() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy_MM_dd");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }

    public static void getCurrentTimeString() {
        SimpleDateFormat formatter= new SimpleDateFormat("HH_mm");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }
}
