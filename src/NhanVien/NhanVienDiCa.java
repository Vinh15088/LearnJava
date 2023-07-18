package NhanVien;

public class NhanVienDiCa extends NhanVien{
    protected int ca;
    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*1.2;
    }
}
