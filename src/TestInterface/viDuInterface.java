package TestInterface;

public interface viDuInterface {
    // tap cac thuoc tinh (chi duoc phep la hang so)
    static final double phuCap = 15;

    // cac phuong thuc
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgayCong);
}
