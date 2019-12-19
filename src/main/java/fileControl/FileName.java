package fileControl;

import miscellaneous.DateNow;

public class FileName {

    public FileName() {
    }

    public static String modifyName(String fileName) {
        StringBuffer textbuffer = new StringBuffer(fileName);
        int position = textbuffer.lastIndexOf(".");
        textbuffer.insert(position, DateNow.getCurrentDateTimeString());
        return textbuffer.toString();
    }

}