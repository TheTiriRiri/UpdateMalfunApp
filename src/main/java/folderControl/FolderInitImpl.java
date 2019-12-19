package folderControl;

import fileControl.FileInit;
import staticVar.Var;

public class FolderInitImpl {

    private FolderInit folderInit;
    private FileInit fileInit;

    public FolderInitImpl() {
        folderInit = new FolderInit(Var.pathFolderDownloads, Var.pathFolderCompare, Var.pathFolderHistory
                , Var.pathFolderNew, Var.pathFolderOld, Var.pathFolderResult, Var.pathFolderTemp);
        fileInit = new FileInit(Var.pathLogsFile);
    }
}