package folderControl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FolderOperation {

    private List<File> listFiles;

    public FolderOperation() {

    }

    public void searchFolder(String path) {
        try {
            listFiles = Files.walk(Paths.get(path))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("NO FILES IN FOLDER");
            e.printStackTrace();
        }
    }
}
