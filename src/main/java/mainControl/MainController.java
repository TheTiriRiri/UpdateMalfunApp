package mainControl;

import fileControl.FileName;
import fileControl.FileOperation;
import folderControl.FolderInitImpl;
import folderControl.FolderSearch;
import staticVar.Var;

import java.io.IOException;

public class MainController {

    FolderInitImpl folderInitImpl;

    public MainController() {
        folderInitImpl = new FolderInitImpl();
    }

    public void run() throws IOException {
        // downloads file from SP

        // search downloads folder
        FolderSearch folderSearchDownloads = new FolderSearch(Var.pathFolderDownloads);
        FolderSearch folderSearchOld = new FolderSearch(Var.pathFolderOld);

        //copy file form downloads to new and temp
        FileOperation.copy(folderSearchDownloads.getListFilePathString().get(0)
                , Var.pathFolderNew + FileName.modifyName(folderSearchDownloads.getListFileName().get(0)));

        //delete from downloads
        /*FileOperation.delete(folderSearchDownloads.getListFilePathString().get(0));*/

        //open excel from new
        FolderSearch folderSearchNew = new FolderSearch(Var.pathFolderNew);
        boolean compareFileSizeIsOk = FileOperation.compareSizeIsOk(FileOperation.getFileSizeMegaBytes(folderSearchNew.getListFilePathString().get(0))
                , FileOperation.getFileSizeMegaBytes(folderSearchDownloads.getListFilePathString().get(0)), 1.0);

        //open excel from old
        //compare new - old
        //generate comparison
        //generate modified file
        //delete from old
        //move from new to old
        //delete from temp
    }
}