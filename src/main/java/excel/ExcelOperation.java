package excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class ExcelOperation {

    public static Sheet ExecuteSheet;

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

    public static void getExcelSheetValueAt(Workbook serverWorkbook) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("???number of sheets???");
        int i = keyboard.nextInt();
        ExecuteSheet = serverWorkbook.getSheetAt(i - 1);
        System.out.println("Proceeding sheet: " + ExecuteSheet.getSheetName());
    }

    public static void getExcelSheetAt(/*ExecuteSheet*/) {
        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        // 1. You can obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = ExecuteSheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }

        /*        // 2. Or you can use a for-each loop to iterate over the rows and columns
        System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
        for (Row row : sheet) {
            for (Cell cell : row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }

        // 3. Or you can use Java 8 forEach loop with lambda
        System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
        sheet.forEach(row -> {
            row.forEach(cell -> {
                printCellValue(cell);
            });
            System.out.println();
        });*/
    }

    public static void excelClose(Workbook serverWorkbook) throws IOException {
        serverWorkbook.close();
    }
}
