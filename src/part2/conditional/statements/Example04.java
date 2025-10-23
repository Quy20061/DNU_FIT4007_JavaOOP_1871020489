package part2.conditional.statements;
import java.util.Scanner;

public class Example04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào hai số nguyên a và b
            System.out.print("Nhập số nguyên a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập số nguyên b: ");
            int b = scanner.nextInt();

            // Dùng câu lệnh điều kiện để tìm số lớn hơn
            if (a > b) {
                System.out.println("Số lớn hơn là: " + a);
            } else if (b > a) {
                System.out.println("Số lớn hơn là: " + b);
            } else {
                System.out.println("Hai số bằng nhau.");
            }

            scanner.close();
        }
}
