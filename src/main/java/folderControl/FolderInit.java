package folderControl;

import java.io.File;

public class FolderInit {

    private File file;

    public FolderInit(String path1, String path2, String path3
            , String path4, String path5, String path6, String path7) {
        initialize(path1);
        initialize(path2);
        initialize(path3);
        initialize(path4);
        initialize(path5);
        initialize(path6);
        initialize(path7);
    }

    public void initialize(String path) {
        file = new File(path);
        if (!file.exists()) {
            System.out.print("No Folder: \n" + path + "\n");
            file.mkdir();
            System.out.print("Folder created: \n" + path + "\n");
        }
    }
}