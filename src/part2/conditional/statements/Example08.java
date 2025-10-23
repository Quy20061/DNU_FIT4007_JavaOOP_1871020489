package part2.conditional.statements;
import java.util.Scanner;

public class Example08 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Nhập vào một số thực
            System.out.print("Nhập vào một số thực: ");
            float a = scanner.nextFloat();
            // Kiểm tra xem a có phải là số nguyên hay không
            if (a == (int)a) {
                System.out.println(a + " là số nguyên.");
            } else {
                System.out.println(a + " không phải là số nguyên.");
            }

            scanner.close();
        }
}
