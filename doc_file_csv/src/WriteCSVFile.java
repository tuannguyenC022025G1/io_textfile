import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {
    public static void main(String[] args) {
        String fileName = "countries.csv";

        // Mỗi dòng là một bản ghi với định dạng: id,"code","name"
        String[] countries = {
                "1,\"AU\",\"Australia\"",
                "2,\"CN\",\"China\"",
                "3,\"AU\",\"Australia\"",
                "4,\"CN\",\"China\"",
                "5,\"JP\",\"Japan\"",
                "6,\"CN\",\"China\"",
                "7,\"JP\",\"Japan\"",
                "8,\"TH\",\"Thailand\""
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : countries) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File " + fileName + " đã được tạo thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
