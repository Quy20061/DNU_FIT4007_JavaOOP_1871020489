import java.util.Scanner;

class PhepToanHaiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên a và b
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        // Tính toán
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);

        // Kiểm tra chia cho 0
        if (b != 0) {
            double thuong = (double) a / b; // ép kiểu để ra số thực
            System.out.println("Thương = " + thuong);
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        sc.close();
    }
}
