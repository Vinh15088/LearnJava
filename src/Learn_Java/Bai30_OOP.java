public class Bai30_OOP {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Vinh");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Vinh", 9.5);
        sv4.hienThiThongTin();
        System.out.println(sv4.getName());
        System.out.println(sv4.getDiem());
        // Thay doi Name, Diem cua sinhvien
        sv4.setName("VinhSeo");
        sv4.setDiem(25);
        sv4.hienThiThongTin();
        double diemTBsV4 = sv4.tinhDTB(7.5, 9);
        System.out.println(diemTBsV4);

        System.out.println(sv4);

        sv4.checkHopLeDiem();

        double kq = sv4.tongDiem(1,2,3,4,5,6,7,8,9);
        System.out.println(kq);
    }
}
