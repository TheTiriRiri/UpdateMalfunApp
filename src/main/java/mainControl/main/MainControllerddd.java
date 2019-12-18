/*
package ExcelFileProgram.main;

import ExcelFileProgram.comparator.FileComparatorController;
import ExcelFileProgram.excel.ExcelFileControllerImpl;
import folderControl.FolderController;
import folderControl.FolderControllerImpl;
import ExcelFileProgram.listFilesToCompare.FileToCompareListControllerImpl;
import ExcelFileProgram.queueBaseFiles.BaseFileQueueControllerImpl;

import java.io.File;

public class MainControllerddd {

// linux path    private static String firstFileDirectory = "/home/konradk/Documents/KonradSoftware/6666/v0011/";
// linux path    private static String secondFileDirectory = "/home/konradk/Documents/KonradSoftware/6666/v0021/";

    private static String firstFileDirectory = "C:\\excelComp\\old";    // windows path
    private static String secondFileDirectory = "C:\\excelComp\\new";   // windows path
    private static String resultFileDirectory= "C:\\excelComp\\result";   // windows path
    private static String resultFileName = "result";

    private FolderController serverOneFolderController;
    private FolderController serverTwoFolderController;
    private BaseFileQueueControllerImpl serverOneQueueControllerImpl;
    private FileToCompareListControllerImpl serverTwoListControllerImpl;
    private ExcelFileControllerImpl serverOneFileControllerImpl;
    private ExcelFileControllerImpl serverTwoFileControllerImpl;
    private FileComparatorController fileComparatorController;
    private File serverOneFile;
    private File serverTwoFile;

    public MainControllerddd() {
        serverOneFolderController = new FolderControllerImpl(firstFileDirectory);
        serverTwoFolderController = new FolderControllerImpl(secondFileDirectory);
    }

    public void run() throws Exception {
        collectFilesInBothFolders();
        initializeQueueFiles();
        initializeListFilesToCompare();

        while (nextToCompareIsOk()) {
            setFilesToComparison();
            readExcel();
//            compareConvertedLists();


            ////////////////
            serverOneQueueControllerImpl.setNext();
            System.out.println("**********************");
        }
    }

    private void collectFilesInBothFolders() {
        serverOneFolderController.collectFilesInFolder();
        serverTwoFolderController.collectFilesInFolder();
    }

    private void initializeQueueFiles() {
        serverOneQueueControllerImpl = new BaseFileQueueControllerImpl(serverOneFolderController.getFilesInFolder());
    }

    private void initializeListFilesToCompare() {
        serverTwoListControllerImpl = new FileToCompareListControllerImpl(serverTwoFolderController.getFilesInFolder());
    }

    private Boolean nextToCompareIsOk() {
        return serverOneQueueControllerImpl.queueNotEmpty() && serverTwoListControllerImpl.ListNotEmpty();
    }

    private void setFilesToComparison() throws Exception {
        serverOneFile = serverOneQueueControllerImpl.getFileToPerform();
        serverTwoFile = serverTwoListControllerImpl.getFileToCompare(serverOneQueueControllerImpl.getNameFileToPerform());
    }

    private void readExcel() {
        serverOneFileControllerImpl = new ExcelFileControllerImpl(serverOneFile);
        serverTwoFileControllerImpl = new ExcelFileControllerImpl(serverTwoFile);
        serverOneFileControllerImpl.createDataList();
        serverTwoFileControllerImpl.createDataList();
    }

    private void compareConvertedLists() {
        fileComparatorController = new FileComparatorController(
                serverOneFileControllerImpl.getExcelFileImpl(),
                serverTwoFileControllerImpl.getExcelFileImpl());
        fileComparatorController.prepareListAssumptions();
    }
}*/
