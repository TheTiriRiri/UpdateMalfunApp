package excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.IOException;

public class ExcelControllerImpl {

    private Workbook oneServerWorkbook;
    private Workbook twoServerWorkbook;

    public ExcelControllerImpl() {
    }

    public void run(String oneServerFilePath, String twoServerFilePath) throws IOException, InvalidFormatException {
        oneServerWorkbook = ExcelOperation.excelOpen(oneServerFilePath);
        twoServerWorkbook = ExcelOperation.excelOpen(twoServerFilePath);
        ExcelOperation.getExcelSheet(oneServerWorkbook);
        ExcelOperation.getExcelSheet(twoServerWorkbook);
    }
}
