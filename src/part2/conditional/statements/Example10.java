package part2.conditional.statements;
import java.util.Scanner;

public class Example10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào 3 số nguyên dương a, b, c
            System.out.print("Nhập số nguyên dương a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập số nguyên dương b: ");
            int b = scanner.nextInt();

            System.out.print("Nhập số nguyên dương c: ");
            int c = scanner.nextInt();

            // Kiểm tra điều kiện đầu vào
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Tất cả các số phải là số nguyên dương.");
            } else {
                boolean laUoc = a % b == 0;
                boolean laBoi = b % c == 0;

                if (laUoc && laBoi) {
                    System.out.println("b đồng thời là ước của a và là bội của c.");
                } else {
                    System.out.println("b không đồng thời là ước của a và là bội của c.");
                }
            }

            scanner.close();
        }
}
