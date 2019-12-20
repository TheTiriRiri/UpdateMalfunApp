package mainControl;

import excel.ExcelControllerImpl;
import fileControl.FileName;
import fileControl.FileOperation;
import folderControl.FolderInitImpl;
import folderControl.FolderSearch;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import staticVar.Var;

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
        boolean compareFileSizeIsOk = FileOperation.compareSizeIsOk(FileOperation
                        .getFileSizeMegaBytes(folderSearchOld.getListFilePathString().get(0))
                , FileOperation
                        .getFileSizeMegaBytes(folderSearchNew.getListFilePathString().get(0))
                , 1.0);

        //open excel from old
        excelControllerImpl.run(folderSearchOld.getListFilePathString().get(0)
                /*".\\operationFolder\\old\\005 - Spec_AMFCC_2019_12_10.xlsx"*/
                , folderSearchNew.getListFilePathString().get(0));


        //compare new - old
        //generate comparison
        //generate modified file
        //delete from old
        //move from new to old
        //delete from temp
    }
}