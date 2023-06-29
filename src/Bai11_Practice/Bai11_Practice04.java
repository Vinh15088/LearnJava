package Bai11_Practice;

import java.util.Scanner;

public class Bai11_Practice04 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 1 thang bat ky: ");
        int x = new Scanner(System.in).nextInt();

        if(x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12)
            System.out.println(31);
        else if (x == 4 || x == 6 || x == 9 || x == 11)
            System.out.println(30);
        else {
            System.out.println("Nhap nam cua thang vua nhap: ");
            int nam = new Scanner(System.in).nextInt();
            if((nam%4==0 && nam%100!=0) || nam%400==0)
                System.out.println(29);
            else
                System.out.println(28);
        }
    }
}
