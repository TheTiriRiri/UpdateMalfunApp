package excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ExcelOperation {

    public ExcelOperation() {

    }

    public static void excelOpen(String filePath) throws IOException
            , InvalidFormatException {
        Workbook serverWorkbook = WorkbookFactory.create(new File(filePath));
        System.out.println("Workbook has " + serverWorkbook.getNumberOfSheets() + " Sheets : ");
    }

    public static void getExcelSheet() {
        System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
        serverWorkbook.forEach(sheet -> {
            System.out.println("=> " + sheet.getSheetName());
        });
    }

}
