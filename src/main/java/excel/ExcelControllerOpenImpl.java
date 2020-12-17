package excel;

import fileControl.FileOperation;
import miscellaneous.SystemOperation;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.IOException;
import java.util.List;

public class ExcelControllerOpenImpl {

    private Workbook oneServerWorkbook;

    public Workbook getOneServerWorkbook() {
        return oneServerWorkbook;
    }

    public ExcelControllerOpenImpl() {
    }

    public void run(String oneServerFilePath) throws IOException, InvalidFormatException {
        // compare excels size - in tolerance...
        //  filesSizeOutOfTolerance(oneServerFilePath, twoServerFilePath);

        //open excels
        oneServerWorkbook = ExcelOperation.excelOpen(oneServerFilePath);
        ExcelOperation.getExcelSheet(oneServerWorkbook);
        ExcelOperation.getExcelSheetValueAt(oneServerWorkbook);
        ExcelOperation.getExcelSheetAt();
       // ExcelOperation.excelClose(oneServerWorkbook); //error!
    }

/*    private void filesSizeOutOfTolerance(String oneServerFilePath, String twoServerFilePath) {
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
                , 1.0);//mb
    }*/
}