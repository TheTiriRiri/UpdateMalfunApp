package fileControl;

import java.io.File;
import java.io.IOException;

public class FileInit {

    public FileInit(String path) {
        initializeFile(path);
    }

    public void initializeFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.print("No File: \t" + path + "\n");
                System.out.print("File created: \t" + path + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
