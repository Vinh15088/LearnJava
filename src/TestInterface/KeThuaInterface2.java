package TestInterface;

public class KeThuaInterface2 implements viDuInterface2,viDuInterface{
    @Override
    public void setThuong(int cccd, double doanhThu) {

    }

    @Override
    public void thongTin(String ten, String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
    }
}
