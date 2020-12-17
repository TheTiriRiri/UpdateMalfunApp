package excel;

import fileControl.FileOperation;
import miscellaneous.SystemOperation;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.IOException;

public class ExcelControllerCompImpl {

    private Workbook oneServerWorkbook;
    private Workbook twoServerWorkbook;

    public ExcelControllerCompImpl() {
    }

    public void run(String oneServerFilePath, String twoServerFilePath) throws IOException, InvalidFormatException {
        // compare excels size - in tolerance...
      //  filesSizeOutOfTolerance(oneServerFilePath, twoServerFilePath);

        //open excels
        oneServerWorkbook = ExcelOperation.excelOpen(oneServerFilePath);
        ExcelOperation.getExcelSheet(oneServerWorkbook);
        twoServerWorkbook = ExcelOperation.excelOpen(twoServerFilePath);
        ExcelOperation.getExcelSheet(twoServerWorkbook);
    }

    private void filesSizeOutOfTolerance(String oneServerFilePath, String twoServerFilePath) {
        if (!compareFileSizeIsOk(oneServerFilePath, twoServerFilePath)) {
            System.out.println("FILES OUT OF SIZE TOLERANCE");
            SystemOperation.appAbort();
        }
    }

    private boolean compareFileSizeIsOk(String oneServerFilePath, String twoServerFilePath) {
        return FileOperation.compareSizeIsOk(FileOperation
                        .getFileSizeMegaBytes(oneServerFilePath)
                , FileOperation
                        .getFileSizeMegaBytes(twoServerFilePath)
                , 1.0);
    }
}