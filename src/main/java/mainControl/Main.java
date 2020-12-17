package mainControl;

import miscellaneous.DateNow;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        DateNow.getCurrentDateTimeStartString();

        new MainController().run();

        //TimeUnit.SECONDS.sleep(1);

        DateNow.getCurrentDateTimeEndString();
    }
}