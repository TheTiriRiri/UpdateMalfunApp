package mainControl.main;

import miscellaneous.DateNow;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        DateNow.getCurrentDateTimeStartString();
        new MainController().run();
        //TimeUnit.SECONDS.sleep(3);
        DateNow.getCurrentDateTimeEndString();
    }
}