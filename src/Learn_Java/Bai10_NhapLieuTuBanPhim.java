package Learn_Java;

import java.util.Scanner;

public class Bai10_NhapLieuTuBanPhim {
    public static void main(String[] args) {
//        // Khoi tao 1 doi tuong ccanner
//        Scanner sc = new Scanner(System.in);
//
//        // Cho phep nhap chuoi
//        System.out.println("Moi nhap vao mat khau cap 1: ");
//        String mk1 = sc.nextLine();
//        System.out.println("Mat khau cap 1 la: " + mk1);
//
//        // Nhap so nguyen
//        System.out.println("Moi nhap vao 1 so nguyen: ");
//        int a = sc.nextInt();
//        System.out.println("So nguyen vua nhap la: " + a);
//
//        // Nhap so float
//        System.out.println("Moi nhap vao 1 so thuc: ");
//        float b = sc.nextFloat();
//        System.out.println("So thuc vua nhap la: " + b);

        // Cach 2: Khai bao theo kieu
        // Nhap chuoi
        System.out.println("Nhap ten: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Ten vua nhap la: " + ten);

        // Nhap chuoi thu 2
        System.out.println("Nhap ten thu 2: ");
        String ten2 = new Scanner(System.in).nextLine();
        System.out.println("Ten vua nhap thu 2 la: " + ten2);

        // Nhap float
        System.out.println("Nhap mot so thuc: ");
        float x = new Scanner(System.in).nextFloat();
        System.out.println("So thuc vua nhap la: " + x);

        // Nhap float thu 2
        System.out.println("Nhap mot so thuc thu 2: ");
        float x2 = new Scanner(System.in).nextFloat();
        System.out.println("So thuc vua nhap thu hai la: " + x2);

    }
}
