import java.util.Scanner;

 class NameLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();

        // Bỏ khoảng trắng hai đầu
        String trimmed = name.trim();

        // Độ dài bao gồm khoảng trắng (sau khi trim 2 đầu)
        int lengthWithSpaces = trimmed.length();

        // Độ dài không tính khoảng trắng bên trong
        int lengthWithoutSpaces = trimmed.replace(" ", "").length();

        // Số từ trong tên
        int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;

        System.out.println("Tên đã nhập: \"" + trimmed + "\"");
        System.out.println("Độ dài (bao gồm khoảng trắng giữa các từ) = " + lengthWithSpaces);
        System.out.println("Độ dài (không tính khoảng trắng) = " + lengthWithoutSpaces);
        System.out.println("Số từ trong tên = " + words);

        sc.close();
    }
}
