package excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ExcelOperation {

    public ExcelOperation() {

    }

    public static Workbook excelOpen(String filePath) throws IOException
            , InvalidFormatException {
        Workbook serverWorkbook = WorkbookFactory.create(new File(filePath));
        return serverWorkbook;
    }

    public static void getExcelSheet(Workbook serverWorkbook) {
        serverWorkbook.forEach(sheet -> {
            System.out.println("=> " + sheet.getSheetName());
        });
    }

}
