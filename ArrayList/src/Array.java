import java.util.ArrayList;

public class Array {


	public static void main(String[] args) {
		ArrayList<SanPham> dsSanPham;
		
		dsSanPham = new ArrayList<SanPham>();
		
//		SanPham sp1 = new SanPham (0,"kem","giai khat",null);
		SanPham sp2 = new SanPham (1,"pho",null,null);
		SanPham sp3 = new SanPham (2,"com",null,null);
		
		
		dsSanPham.add(new SanPham(0,"kem","giai khat",null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		
		for (int i=0;i<dsSanPham.size();i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
		

	}

}
