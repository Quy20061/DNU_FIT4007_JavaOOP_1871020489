import java.util.Scanner;

 class ChuSoCuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập số nguyên N: ");
        int N = sc.nextInt();

        // Lấy chữ số cuối cùng
        int chuSoCuoi = Math.abs(N % 10);

        // In kết quả
        System.out.println("Chữ số cuối cùng của " + N + " là: " + chuSoCuoi);

        sc.close();
    }
}
