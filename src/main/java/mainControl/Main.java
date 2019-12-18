package mainControl;

import miscellaneous.DateNow;

public class Main {
    public static void main(String[] args) throws Exception {
        DateNow.getCurrentDateTimeStartString();
        new MainController().run();
        //TimeUnit.SECONDS.sleep(3);
        DateNow.getCurrentDateTimeEndString();
    }
}