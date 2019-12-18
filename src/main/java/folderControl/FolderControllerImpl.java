package folderControl;

import com.sun.org.apache.xpath.internal.operations.Variable;
import staticF.Var;

import java.io.File;
import java.util.List;

public class FolderControllerImpl /*implements FolderController */ {

    private FolderInit folderInit;
    private FolderOperation folderOperation;
    private List<File> listFilePath;
    private List<String> listFileName;

    public FolderControllerImpl() {
        folderInit = new FolderInit(Var.pathFolderDownloads, Var.pathFolderCompare, Var.pathFolderHistory
                , Var.pathFolderNew, Var.pathFolderOld, Var.pathFolderResult, Var.pathFolderTemp);
        folderOperation = new FolderOperation();
    }

    public List<File> getListFilePath() {
        return folderOperation.getListFilePath(); // check
    }

    public List<String> getListFileName() {
        return folderOperation.getListFileName();
    }

    public void start() {
        //download form SP recent file

        folderOperation.searchFolder(Var.pathFolderDownloads);
    }

}