import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        // Nhập hệ số a (phải khác 0)
        do {
            System.out.print("Nhập hệ số a (≠ 0): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Vui lòng nhập một số hợp lệ!");
                scanner.next();
            }
            a = scanner.nextDouble();
        } while (a == 0);

        // Nhập hệ số b
        System.out.print("Nhập hệ số b: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next();
        }
        b = scanner.nextDouble();

        // Nhập hệ số c
        System.out.print("Nhập hệ số c: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next();
        }
        c = scanner.nextDouble();

        // Tính Delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Hiển thị kết quả
        System.out.println("\nGiá trị của Delta: " + delta);
        if (delta >= 0) {
            System.out.println("Căn Delta: " + Math.sqrt(delta));
        } else {
            System.out.println("Không thể tính căn Delta vì Delta âm.");
        }

        scanner.close();
    }
}
