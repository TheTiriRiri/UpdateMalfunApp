package mainControl;

import excel.ExcelControllerCompImpl;
import excel.ExcelControllerOpenImpl;
import fileControl.FileName;
import fileControl.FileOperation;
import folderControl.FolderInitImpl;
import folderControl.FolderSearch;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import staticVar.Var;

import java.io.File;
import java.io.IOException;

public class MainController {

    FolderInitImpl folderInitImpl;
    ExcelControllerOpenImpl excelControllerOpenImpl;
    //ExcelControllerCompImpl excelControllerCompImpl;
    Workbook oneServerFile;
    //File twoServerFile;

    public MainController() {
        folderInitImpl = new FolderInitImpl();
        excelControllerOpenImpl = new ExcelControllerOpenImpl();
    }

    public void run() throws IOException, InvalidFormatException {
        // downloads file from SP - to do soon

        // search downloads folder
        FolderSearch folderSearchDownloads = new FolderSearch(Var.pathFolderDownloads);
        //FolderSearch folderSearchOld = new FolderSearch(Var.pathFolderOld);

        //copy file from downloads to new and temp
        FileOperation.copy(folderSearchDownloads.getListFilePathString().get(0)
                , Var.pathFolderTemp + FileName.modifyName(folderSearchDownloads.getListFileName().get(0)));

        //delete from downloads
        /*FileOperation.delete(folderSearchDownloads.getListFilePathString().get(0));*/

        //open excel from temp
        FolderSearch folderSearchTemp = new FolderSearch(Var.pathFolderTemp);

        //open excel
        excelControllerOpenImpl.run(folderSearchTemp.getListFilePathString().get(0));
        oneServerFile = excelControllerOpenImpl.getOneServerWorkbook();

        //create table "database"
        oneServerFile = excelControllerOpenImpl.getOneServerWorkbook();

        //open excels to compare
        /*excelControllerCompImpl.run(folderSearchOld.getListFilePathString().get(0)
                , folderSearchNew.getListFilePathString().get(0));*/


        //compare new - old
        //generate comparison
        //generate modified file
        //delete from old
        //move from new to old
        //delete from temp


    }
}