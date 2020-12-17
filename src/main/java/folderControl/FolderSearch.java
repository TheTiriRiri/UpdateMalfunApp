package folderControl;

import miscellaneous.SystemOperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FolderSearch {

    private List<File> listFilePath = new ArrayList<>();
    private List<String> listFilePathString = new ArrayList<>();
    private List<String> listFileName = new ArrayList<>();

    public FolderSearch(String path) {
        searchFolder(path);
    }

    public List<File> getListFilePath() {
        return listFilePath;
    }

    public List<String> getListFilePathString() {
        return listFilePathString;
    }

    public List<String> getListFileName() {
        return listFileName;
    }

    public void searchFolder(String path) {
        try {
            listFilePath = Files.walk(Paths.get(path))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            createListFilePathString();
            createListFileName();

            if (listFilePath.isEmpty()) {
                System.out.println("FOLDER: " + path + " - EMPTY");
                SystemOperation.appAbort();
            }

            System.out.println("FOLDER: " + path + "File exist:");
            listFileName.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("PATH: " + path + " - DOES NOT EXIST");
            e.printStackTrace();
        }
    }

    public void createListFilePathString() {
        listFilePath.stream()
                .map(s -> s.getPath())
             //   .filter(s -> s.endsWith(".xlsx"))
                .forEach(listFilePathString::add);
    }

    public void createListFileName() {
        listFilePath.stream()
                .map(s -> s.getName())
            //    .filter(s -> s.endsWith(".xlsx"))
                .forEach(listFileName::add);
    }
}

      /*try (Stream<Path> walk = Files.walk(Paths.get(path))) {

        listFileName = walk.map(x -> x.toString())
        .filter(f -> f.endsWith(".xlsx"))
        .collect(Collectors.toList());

        //    listFileName.forEach(System.out::println);

        } catch (IOException e) {
        e.printStackTrace();
        }*/