package part2.conditional.statements;
import java.util.Scanner;

public class Example06 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Nhập vào 3 số nguyên a, b, c
            System.out.print("Nhập cạnh a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập cạnh b: ");
            int b = scanner.nextInt();

            System.out.print("Nhập cạnh c: ");
            int c = scanner.nextInt();

            // Kiểm tra điều kiện tạo thành tam giác
            if (a > 0 && b > 0 && c > 0 &&
                    a + b > c && a + c > b && b + c > a) {
                System.out.println("Ba cạnh này có thể tạo thành một tam giác.");
            } else {
                System.out.println("Ba cạnh này không thể tạo thành một tam giác.");
            }

            scanner.close();
        }
}
