import java.util.Scanner;

public class TheTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chieuDai, chieuRong, chieuCao;

        // Nhập chiều dài
        do {
            System.out.print("Nhập chiều dài (> 0): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Vui lòng nhập một số hợp lệ!");
                scanner.next();
            }
            chieuDai = scanner.nextDouble();
        } while (chieuDai <= 0);

        // Nhập chiều rộng
        do {
            System.out.print("Nhập chiều rộng (> 0): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Vui lòng nhập một số hợp lệ!");
                scanner.next();
            }
            chieuRong = scanner.nextDouble();
        } while (chieuRong <= 0);

        // Nhập chiều cao
        do {
            System.out.print("Nhập chiều cao (> 0): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Vui lòng nhập một số hợp lệ!");
                scanner.next();
            }
            chieuCao = scanner.nextDouble();
        } while (chieuCao <= 0);

        // Tính thể tích
        double theTich = chieuDai * chieuRong * chieuCao;

        // Xuất kết quả
        System.out.println("Thể tích khối chữ nhật: " + theTich);

        scanner.close();
    }
}
