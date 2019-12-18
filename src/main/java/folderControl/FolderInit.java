package folderControl;

import staticF.Var;

import java.io.File;

public class FolderInit {

    String path = Var.pathFolderCompare;
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


  /*  {
        File f = new File("C:/AMD");
        if (f.exists() && f.isDirectory()) {
            System.out.println("Exists");
            //if the file is present then it will show the msg
        } else {
            System.out.println("NOT Exists");
            //if the file is Not present then it will show the msg
        }
    }
}


    File sourceLoc = new File("/a/b/c/folderName");
    boolean isFolderExisted = false;
          sourceLoc.exists()==true?sourceLoc.isDirectory()==true?isFolderExisted=true:isFolderExisted=false:isFolderExisted=false;*/