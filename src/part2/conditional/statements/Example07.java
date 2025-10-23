package part2.conditional.statements;
import java.util.Scanner;

public class Example07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào 3 số nguyên a, b, c
            System.out.print("Nhập góc a (độ): ");
            int a = scanner.nextInt();

            System.out.print("Nhập góc b (độ): ");
            int b = scanner.nextInt();

            System.out.print("Nhập góc c (độ): ");
            int c = scanner.nextInt();

            // Kiểm tra điều kiện góc của tam giác
            if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
                System.out.println("Ba góc này có thể là góc của một tam giác.");
            } else {
                System.out.println("Ba góc này không thể là góc của một tam giác.");
            }
            scanner.close();
        }

}
