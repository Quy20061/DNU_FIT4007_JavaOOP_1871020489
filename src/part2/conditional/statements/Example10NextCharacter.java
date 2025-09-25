import java.util.Scanner;

class KyTuKeTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập ký tự thường
        System.out.print("Nhập một ký tự thường (từ 'a' đến 'y'): ");
        char ch = sc.next().charAt(0);

        // Kiểm tra hợp lệ và in ra ký tự kế tiếp
        if (ch >= 'a' && ch <= 'y') {
            char nextChar = (char)(ch + 1);
            System.out.println("Ký tự liền sau '" + ch + "' là: " + nextChar);
        } else {
            System.out.println("Ký tự không hợp lệ! Vui lòng nhập từ 'a' đến 'y'.");
        }

        sc.close();
    }
}
