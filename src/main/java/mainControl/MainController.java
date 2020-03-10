package mainControl;

import excel.ExcelControllerImpl;
import folderControl.FolderInitImpl;
import dao.RecordDAO;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.IOException;

public class MainController {

    FolderInitImpl folderInitImpl;
    ExcelControllerImpl excelControllerImpl;
    File oneServerFile;
    File twoServerFile;

    public MainController() {
        folderInitImpl = new FolderInitImpl();
        excelControllerImpl = new ExcelControllerImpl();
    }

    public void run() throws IOException, InvalidFormatException {
        // downloads file from SP - to do soon

        // search downloads folder
        /*FolderSearch folderSearchDownloads = new FolderSearch(Var.pathFolderDownloads);
        FolderSearch folderSearchOld = new FolderSearch(Var.pathFolderOld);*/

        //copy file form downloads to new and temp
       /* FileOperation.copy(folderSearchDownloads.getListFilePathString().get(0)
                , Var.pathFolderNew + FileName.modifyName(folderSearchDownloads.getListFileName().get(0)));*/

        //delete from downloads
        /*FileOperation.delete(folderSearchDownloads.getListFilePathString().get(0));*/

        //open excel from new
        /* FolderSearch folderSearchNew = new FolderSearch(Var.pathFolderNew);*/

        //open excels
      /*  excelControllerImpl.run(folderSearchOld.getListFilePathString().get(0)
                , folderSearchNew.getListFilePathString().get(0));*/


        //compare new - old
        //generate comparison
        //generate modified file
        //delete from old
        //move from new to old
        //delete from temp
        new RecordDAO().showRecords();


    }
}