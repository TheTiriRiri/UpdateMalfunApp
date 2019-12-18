package fileControl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileOperation {

    File file;
    private String pathFile;
    private String nameFile;
    private boolean fileOperationIsOk = false;

    public FileOperation() {

    }

    public void copyTo(File source, File dest) throws IOException {
        try {
            Files.copy(source.toPath(), dest.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(String source) {
        try {
            Files.delete(Paths.get(source));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // download from sharepoint
    public boolean downloadFromSp() {

        return fileOperationIsOk;
    }
}