import java.util.Scanner;

class ChuSoGanCuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập số nguyên N (ít nhất 2 chữ số): ");
        int N = sc.nextInt();

        // Kiểm tra N có ít nhất 2 chữ số
        if (Math.abs(N) > 9) {
            int ganCuoi = Math.abs((N / 10) % 10);
            System.out.println("Chữ số gần cuối của " + N + " là: " + ganCuoi);
        } else {
            System.out.println("Số nhập vào không hợp lệ! N phải có ít nhất 2 chữ số.");
        }

        sc.close();
    }
}
