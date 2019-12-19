package folderControl;

import staticVar.Var;

import java.io.File;
import java.util.List;

public class FolderControllerImpl {

    private FolderSearch folderSearch;
    private List<File> listFilePath;
    private List<String> listFileName;

    public FolderControllerImpl() {
        folderSearch = new FolderSearch();
    }

    public List<File> getListFilePath() {
        return folderSearch.getListFilePath(); // check
    }

    public List<String> getListFileName() {
        return folderSearch.getListFileName();
    }

    public void start() {
        //download form SP recent file
        folderSearch.searchFolder(Var.pathFolderDownloads);
    }
}