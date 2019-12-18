package fileControl;

import java.io.File;
import java.util.List;

public class FileControllerImpl {

    private FileOperation fileOperation;
    private FileName fileName;
    private List<File> listFilePath;


    public FileControllerImpl() {
        fileOperation = new FileOperation();
        fileName = new FileName();
    }

    public FileControllerImpl(List<File> listFile) {
        this.listFilePath = listFile;
    }

    public void setListFile(List<File> listFilePath) {
        this.listFilePath = listFilePath;
    }
}