package part2.conditional.statements;
import java.util.Scanner;

public class Example05 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào một số
            System.out.print("Nhập điểm số: ");
            double score = scanner.nextDouble();

            // Kiểm tra điểm số hợp lý
            if (score >= 0 && score <= 10) {
                System.out.println("Điểm số hợp lý.");
            } else {
                System.out.println("Điểm số không hợp lý.");
            }

            scanner.close();
        }



}
