package Enum;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // kiem tra thu tu cac gia tri trong enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.gioi.ordinal());
        System.out.println(XepLoai.yeu.ordinal());


        // tao danh sach
        ArrayList<SinhVien> ds = new ArrayList<>();
        // Tao doi tuong sinh vien
        SinhVien sv1 = new SinhVien(1, "Vinh", 9);
        SinhVien sv2 = new SinhVien(2, "Dinh", 9.5);
        SinhVien sv3 = new SinhVien(3, "Linh", 8.5);
        SinhVien sv4 = new SinhVien(4, "Minh", 8);

        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        ds.add(sv4);

        // duyet ds
        for(SinhVien sv:ds){
            System.out.println(sv);
        }
    }
}
