package folderControl;

import staticVar.Var;

public class FolderInitImpl {

    private FolderInit folderInit;

    public FolderInitImpl() {
        folderInit = new FolderInit(Var.pathFolderDownloads, Var.pathFolderCompare, Var.pathFolderHistory
                , Var.pathFolderNew, Var.pathFolderOld, Var.pathFolderResult, Var.pathFolderTemp);
    }
}