package part2.conditional.statements;
import java.util.Scanner;

public class Example12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào một ký tự
            System.out.print("Nhập một ký tự: ");
            char ch = scanner.next().charAt(0);

            // Kiểm tra ký tự có phải là chữ cái in hoa
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + " là chữ cái in hoa.");
            } else {
                System.out.println(ch + " không phải là chữ cái in hoa.");
            }
            scanner.close();
        }
}
