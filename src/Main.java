import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao file nguon: ");
        String sourcePath = scanner.nextLine();
        System.out.println("File dich: ");
        String desPath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        File desFile = new File(desPath);
        try {
            CopyFileUsingStream copy = new CopyFileUsingStream();
            copy.copyFileUsingStream(sourceFile, desFile);
            System.out.println("COmpleted");
        } catch (IOException d) {
            System.out.println("loi");
        }
    }
}