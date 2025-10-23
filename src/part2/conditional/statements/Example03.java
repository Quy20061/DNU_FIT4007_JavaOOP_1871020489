package part2.conditional.statements;
import java.util.Scanner;

public class Example03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào một số nguyên N
            System.out.print("Nhập vào một số nguyên N: ");
            int N = scanner.nextInt();

            // Kiểm tra và in ra kết quả
            if (N % 2 == 0) {
                System.out.println(N + " là số chẵn.");
            } else {
                System.out.println(N + " là số lẻ.");
            }
            scanner.close();
        }

}
