package part2.conditional.statements;
import java.util.Scanner;

public class Example09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào một số nguyên dương N
            System.out.print("Nhập số nguyên dương N: ");
            int N = scanner.nextInt();

            // Kiểm tra điều kiện đầu vào
            if (N <= 0) {
                System.out.println("Vui lòng nhập một số nguyên dương.");
            } else {
                // Tính căn bậc hai của N
                double canBacHai = Math.sqrt(N);

                // Kiểm tra xem căn bậc hai có phải là số nguyên hay không
                if (canBacHai == (int)canBacHai) {
                    System.out.println(N + " là số chính phương.");
                } else {
                    System.out.println(N + " không phải là số chính phương.");
                }
            }
            scanner.close();
        }
}
