package NhanVien;

public class Test {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien("Vinh", "Nam Dinh", 3620201);
//        double luongNv1 = nv1.tinhLuong();
//        System.out.println(luongNv1);

        // Tao doi tuong la nhan vien hanh chinh
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("Minh", "Nam Dinh", 24324);
        double luongHc1 = hc1.tinhLuong();
        System.out.println(luongHc1);

        // Tao doi tuong la nhan vien di ca
        NhanVienDiCa ca1 = new NhanVienDiCa("Viet", "Nam Dinh", 21343);
        double luongCa1 = ca1.tinhLuong();
        System.out.println(luongCa1);

        NhanVienDiCa ca2 = new NhanVienDiCa("Ti", "Hai Phong", 5555, 1);
        double luongCa2 = ca2.tinhLuong();
        System.out.println(luongCa2);
    }
}
