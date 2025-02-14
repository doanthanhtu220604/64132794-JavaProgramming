import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		
	        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
	        Scanner scanner = new Scanner(System.in);
	        
	        // Nhập hai cạnh của hình chữ nhật
	        System.out.print("Nhập chiều dài hình chữ nhật: ");
	        double chieuDai = scanner.nextDouble();
	        
	        System.out.print("Nhập chiều rộng hình chữ nhật: ");
	        double chieuRong = scanner.nextDouble();
	        
	        // Tính chu vi, diện tích và cạnh nhỏ
	        double chuVi = 2 * (chieuDai + chieuRong);
	        double dienTich = chieuDai * chieuRong;
	        double canhNho = Math.min(chieuDai, chieuRong);
	        
	        // Xuất kết quả
	        System.out.println("\nKết quả:");
	        System.out.println("Chu vi: " + chuVi);
	        System.out.println("Diện tích: " + dienTich);
	        System.out.println("Cạnh nhỏ: " + canhNho);
	        
	        // Đóng Scanner
	        scanner.close();

	}

}
