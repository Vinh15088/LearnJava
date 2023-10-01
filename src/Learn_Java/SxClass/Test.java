package SxClass;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // tao list
        ArrayList<SanPham> ds = new ArrayList<>();

        // khoi tao cac doi tuong san pham
        SanPham sp1 = new SanPham(1, "SamSung", 1050);
        SanPham sp2 = new SanPham(2, "Iphone", 1250);
        SanPham sp3 = new SanPham(3, "Huawai", 1150);
        SanPham sp4 = new SanPham(4, "BlackShark", 1000);

        // add SanPham vao list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        ds.add(sp4);

        // xem ds SanPham trong list
        for(SanPham sp:ds){
            System.out.println(sp);
        }

        // sap xep
        Collections.sort(ds);
        System.out.println("Danh sach sau sap xep: ");
        for(SanPham sp:ds){
            System.out.println(sp);
        }
    }
}
