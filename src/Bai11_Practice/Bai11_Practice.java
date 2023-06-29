package Bai11_Practice;

import java.util.Scanner;

public class Bai11_Practice {
    public static void main(String[] args) {
        System.out.println("Nhap vao tong 2 so: ");
        int tong = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao hieu 2 so: ");
        int hieu = new Scanner(System.in).nextInt();

        double x,y;
        x = (double) (tong+hieu)/2;
        y = (double) (tong-hieu)/2;
        System.out.println("Gia tri x can tim la: " + x);
        System.out.println("Gia tri y can tim la: " + y);
    }
}
