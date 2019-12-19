package folderControl;

import java.io.File;
import java.io.IOException;

public class FolderInit {

    private File file;

    public FolderInit(String path1, String path2, String path3
            , String path4, String path5, String path6
            , String path7) {
        initializeFolder(path1);
        initializeFolder(path2);
        initializeFolder(path3);
        initializeFolder(path4);
        initializeFolder(path5);
        initializeFolder(path6);
        initializeFolder(path7);
    }

    public void initializeFolder(String path) {
        file = new File(path);
        if (!file.exists()) {
            System.out.print("No Folder: \t" + path + "\n");
            file.mkdir();
            System.out.print("Folder created: \t" + path + "\n");
        }
    }
}