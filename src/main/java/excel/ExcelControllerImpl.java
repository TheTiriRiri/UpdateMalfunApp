package excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.IOException;

public class ExcelControllerImpl {

    private File oneServer;

    public ExcelControllerImpl() {
    }

    public void run(String oneServerFilePath, String twoServerFilePath) throws IOException, InvalidFormatException {
        ExcelOperation.excelOpen(oneServerFilePath, twoServerFilePath);
    }
}
