package part1.basic.variables;

import java.util.Scanner;

 class HoanDoiKhongBienPhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 2 số nguyên
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        // Hoán đổi không dùng biến phụ
        a = a + b;
        b = a - b;
        a = a - b;

        // In kết quả
        System.out.println("Sau khi hoán đổi:");
        System.out.println("a = " + a + ", b = " + b);

        sc.close();
    }
}
