package Bai11_Practice;

import java.util.Scanner;

public class Bai11_Practice03 {
    public static void main(String[] args) {
        System.out.println("Nhap vao mot nam bat ky: ");
        int nam = new Scanner(System.in).nextInt();

        // Kiem tra nam nhuan
        if((nam%4==0 && nam%100!=0) || nam%400==0)
            System.out.println("Day la nam nhuan");
        else
            System.out.println("Day khong phai la nam nhuan");
    }
}
