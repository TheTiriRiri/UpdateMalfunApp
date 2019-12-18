package folderControl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FolderOperation {

    private List<File> listFilePath;
    private List<String> listFileName = new ArrayList<>();

    public FolderOperation() {
    }

    public List<File> getListFilePath() {
        return listFilePath;
    }

    public List<String> getListFileName() {
        getFileName();
        return listFileName;
    }

    public void searchFolder(String path) {
        try {
            listFilePath = Files.walk(Paths.get(path))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("PATH: " + path + " - NO FILES");
            e.printStackTrace();
        }
    }

    private void getFileName() {
        for (File fileName : listFilePath) {
            String tmp = fileName.getName();
            listFileName.add(tmp);
        }
    }
}
