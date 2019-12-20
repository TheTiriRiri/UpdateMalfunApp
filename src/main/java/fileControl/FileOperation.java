package fileControl;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileOperation {

    public static void copy(String pathSource, String pathDest) throws IOException {
        File src = new File(pathSource);
        File dest = new File(pathDest);

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);

            // buffer size 1K
            byte[] buf = new byte[1024];

            int bytesRead;
            while ((bytesRead = is.read(buf)) > 0) {
                os.write(buf, 0, bytesRead);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void renameTo(String pathSource, String pathDest) {
        File source = new File(pathSource);
        File destination = new File(pathDest);

        if (!destination.exists()) {
            source.renameTo(destination);
        }
    }

    public static void delete(String pathSource) {
        try {
            Files.delete(Paths.get(pathSource));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double getFileSizeMegaBytes(String fileSource) {
        File file = new File(fileSource);
        if (file.exists() && file.isFile()) {
            return (double) file.length() / (1024 * 1024)/* + " mb"*/;
        }
        return 0;
    }

    public static double getFileSizeKiloBytes(String fileSource) {
        File file = new File(fileSource);
        if (!file.exists() || !file.isFile()) {
            return (double) file.length() / 1024 /*+ " kb"*/;
        }
        return 0;
    }

    public static boolean compareSizeIsOk(double serverOneSize, double serverTwoSize, double tolerance) {
        {
            if (Math.abs(serverOneSize - serverTwoSize) < tolerance)
                return true;
            else
                return false;
        }
    }
}