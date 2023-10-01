package TinhDaHinh;

public class PhoPhong extends NhanSu{
    @Override
    public double tinhLuong(int ngayCong) {
        return 40*ngayCong;
    }

    public PhoPhong(String ten, String cccd, String que) {
        super(ten, cccd, que);
    }

    public PhoPhong(String ten, String cccd) {
        super(ten, cccd);
    }

    public PhoPhong() {
    }
}
