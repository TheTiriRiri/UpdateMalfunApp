package mainControl;

import fileControl.FileControllerImpl;
import folderControl.FolderControllerImpl;

public class MainController {

    FolderControllerImpl folderControllerImpl;
    FileControllerImpl fileControllerImpl;

    public MainController() {
        folderControllerImpl = new FolderControllerImpl();
        fileControllerImpl = new FileControllerImpl();
    }

    public void run() {
        folderControllerImpl.start();   // add download from SP
        System.out.println(folderControllerImpl.getListFileName());

        //copy file form downloads to new and temp
        //delete from downloads
        //open excel from temp (new)
        //open excel from old
        //compare new - old
        //generate comparison
        //generate modified file
        //delete from old
        //move from new to old
        //delete from temp
    }
}
