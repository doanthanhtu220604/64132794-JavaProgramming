class SanPham {
    private int id;
    private String ten;
    private String loai;
    private String moTa;

    public SanPham(int id, String ten, String loai, String moTa) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{id=" + id + ", ten='" + ten + "', loai='" + loai + "', moTa='" + moTa + "'}";
    }
}
