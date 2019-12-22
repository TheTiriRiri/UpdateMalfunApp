package excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ExcelOperation {

    public ExcelOperation() {

    }

    public static Workbook excelOpen(String filePath) throws IOException
            , InvalidFormatException {
        System.out.println("Opening: " + filePath);
        Workbook serverWorkbook = WorkbookFactory.create(new File(filePath));
        return serverWorkbook;
    }

    public static void getExcelSheet(Workbook serverWorkbook) {
        int i = 0;
        System.out.println("Number of sheets: " + serverWorkbook.getNumberOfSheets());
        for (Sheet sheet : serverWorkbook) {
            i++;
            System.out.println(i + ". " + sheet.getSheetName());
        }
        /*serverWorkbook.forEach(sheet -> {
            System.out.println(i + ". " + sheet.getSheetName());
        });*/
    }

    public static void excelClose(Workbook serverWorkbook) throws IOException {
        serverWorkbook.close();
    }
}
