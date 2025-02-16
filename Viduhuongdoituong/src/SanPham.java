class SanPham {
    private int maSP;
    private String tenSP;
    private String loaiSP;
    private String anhSP;

    public SanPham() {}

    public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.anhSP = anhSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    }

    public int getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public String getAnhSP() {
        return anhSP;
    }

    @Override
    public String toString() {
        return "[Mã sản phẩm: " + maSP + "\nTên sản phẩm: " + tenSP + 
               "\nLoại sản phẩm: " + loaiSP + "\nẢnh sản phẩm: " + anhSP + "]";
    }
}