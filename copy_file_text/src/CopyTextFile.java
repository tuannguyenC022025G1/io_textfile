import java.io.*;
import java.util.Scanner;

public class CopyTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên file nguồn và file đích
        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra file nguồn tồn tại
        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại!");
            return;
        }

        // Kiểm tra file đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại!");
            return;
        }

        int charCount = 0;

        try (
                Reader reader = new FileReader(sourceFile);
                Writer writer = new FileWriter(targetFile)
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
                charCount++;
            }
            System.out.println("Sao chép thành công. Số ký tự đã sao chép: " + charCount);
        } catch (IOException e) {
            System.out.println("Lỗi trong quá trình sao chép: " + e.getMessage());
        }
    }
}
