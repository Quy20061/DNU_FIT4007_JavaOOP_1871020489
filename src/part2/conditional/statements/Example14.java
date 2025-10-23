package part2.conditional.statements;
import java.util.Scanner;

public class Example14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào hai chuỗi
            System.out.print("Nhập chuỗi a: ");
            String a = scanner.nextLine();

            System.out.print("Nhập chuỗi b: ");
            String b = scanner.nextLine();

            // So sánh độ dài và in ra chuỗi dài hơn
            if (a.length() > b.length()) {
                System.out.println("Chuỗi dài hơn là: " + a);
            } else if (b.length() > a.length()) {
                System.out.println("Chuỗi dài hơn là: " + b);
            } else {
                System.out.println("Hai chuỗi có độ dài bằng nhau. In ra chuỗi a: " + a);
            }

            scanner.close();
        }
}
