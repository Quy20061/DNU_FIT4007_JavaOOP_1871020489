package part2.conditional.statements;
import java.util.Scanner;

public class Example13 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Nhập vào hai chuỗi ký tự a và b
            System.out.print("Nhập chuỗi a: ");
            String a = scanner.nextLine();

            System.out.print("Nhập chuỗi b: ");
            String b = scanner.nextLine();

            // So sánh nội dung hai chuỗi
            if (a.equals(b)) {
                System.out.println("Hai chuỗi giống nhau.");
            } else {
                System.out.println("Hai chuỗi khác nhau.");
            }
            scanner.close();
        }
}
