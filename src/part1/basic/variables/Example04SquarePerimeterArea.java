import java.util.Scanner;

class TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 cạnh tam giác
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        // Kiểm tra điều kiện tạo thành tam giác
        if (a + b > c && a + c > b && b + c > a) {
            // Chu vi
            double chuVi = a + b + c;

            // Nửa chu vi
            double p = chuVi / 2;

            // Diện tích (công thức Heron)
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi tam giác = " + chuVi);
            System.out.println("Diện tích tam giác = " + dienTich);
        } else {
            System.out.println("Ba cạnh nhập vào không tạo thành tam giác hợp lệ!");
        }

        sc.close();
    }
}
