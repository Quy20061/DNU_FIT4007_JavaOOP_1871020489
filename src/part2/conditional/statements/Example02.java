package part2.conditional.statements;

import java.util.Scanner;
public class Example02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 2 cạnh của hình chữ nhật
        System.out.print("Nhập chiều dài: ");
        int chieuDai = scanner.nextInt();

        System.out.print("Nhập chiều rộng: ");
        int chieuRong = scanner.nextInt();

        // Kiểm tra và in ra kết quả
        if (chieuDai > 0 && chieuRong > 0) {
            if (chieuDai == chieuRong) {
                System.out.println("Hình chữ nhật này là hình vuông.");
            } else {
                System.out.println("Hình chữ nhật này không phải là hình vuông.");
            }
        } else {
            System.out.println("Chiều dài và chiều rộng phải là số dương.");
        }

        scanner.close();
    }
}
