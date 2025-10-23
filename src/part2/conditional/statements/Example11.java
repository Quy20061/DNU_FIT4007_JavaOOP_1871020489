package part2.conditional.statements;
import java.util.Scanner;

public class Example11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào một ký tự
            System.out.print("Nhập một ký tự: ");
            char ch = scanner.next().charAt(0);

            // Kiểm tra ký tự có phải là chữ cái in thường
            if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + " là chữ cái in thường.");
            } else {
                System.out.println(ch + " không phải là chữ cái in thường.");
            }

            scanner.close();
        }
}
