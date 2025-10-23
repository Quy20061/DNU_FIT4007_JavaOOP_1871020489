package part2.conditional.statements;
import java.util.Scanner;

public class Example15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Nhập giờ và phút
            System.out.print("Nhập giờ (0 <= h < 24): ");
            int h = scanner.nextInt();

            System.out.print("Nhập phút (0 <= m < 60): ");
            int m = scanner.nextInt();

            // Kiểm tra điều kiện hợp lệ
            if (h >= 0 && h < 24 && m >= 0 && m < 60) {
                // Tăng phút lên 1
                m++;

                // Nếu phút vượt quá 59 thì tăng giờ và đặt phút về 0
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24) {
                        h = 0;
                    }
                }

                // In ra kết quả
                System.out.printf("Thời gian sau 1 phút nữa là: %02d:%02d\n", h, m);
            } else {
                System.out.println("Giá trị giờ hoặc phút không hợp lệ.");
            }
            scanner.close();
        }
}
