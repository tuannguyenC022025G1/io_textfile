import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCountryCSV {
    public static void main(String[] args) {
        String csvFile = "countries.csv"; // Đường dẫn file CSV
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Tách dòng theo dấu phẩy
                String[] data = line.split(",");

                // Loại bỏ dấu ngoặc kép nếu có
                int id = Integer.parseInt(data[0].trim());
                String code = data[1].replace("\"", "").trim();
                String name = data[2].replace("\"", "").trim();

                // In ra thông tin quốc gia
                System.out.println("ID: " + id + ", Code: " + code + ", Name: " + name);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
