import java.util.Scanner;

 class ChiaHaiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hai số nguyên
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b (khác 0): ");
        int b = sc.nextInt();

        if (b != 0) {
            // Thực hiện phép chia, ép kiểu để lấy kết quả thực
            double ketQua = (double) a / b;

            // In kết quả chỉ 1 lần
            System.out.println(a + " / " + b + " = " + ketQua);
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        sc.close();
    }
}
