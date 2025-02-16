public class CT {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham(2, "Bánh Chuối", "Đồ ăn nhanh", "bc.jpg");

        sp1.setMaSP(1);
        sp1.setTenSP("Bia SG");
        sp1.setLoaiSP("Đồ uống có cồn");
        sp1.setAnhSP("sp.jpg");

        // In ra màn hình thông tin sản phẩm
        String thongtinSP1 = sp1.toString();
        String thongtinSP2 = "Mã SP 2 là: " + sp2.getMaSP() + "\n";
        thongtinSP2 += "Tên sản phẩm 2 là: " + sp2.getTenSP() + "\n";

        System.out.println(thongtinSP1);
        System.out.println(thongtinSP2);
    }
}