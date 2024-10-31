import java.io.*;

public class CopyFileUsingStream {

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }

    public static void main(String[] args) {
        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.println("File đã được sao chép thành công!");
        } catch (IOException e) {
            System.err.println("Sao chép tệp thất bại: " + e.getMessage());
        }
    }
}
