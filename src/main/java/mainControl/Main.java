package mainControl;

import miscellaneous.DateNow;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        DateNow.getCurrentDateTimeStartString();
        new MainController().run();

        for (int i = 0; i < 10; i++) {
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.print(".");
        }
        DateNow.getCurrentDateTimeEndString();
    }
}