package Bai11_Practice;

import java.util.Scanner;

public class Bai11_Practice06 {
    public static void main(String[] args) {
        System.out.println("Nhap vao mot thang bat ky ");
        int x = new Scanner(System.in).nextInt();

        if(x == 1 || x == 2 || x == 3)
            System.out.println("Thang vua nhap thuoc quy 1");
        else if(x == 4 || x == 5 || x == 6)
            System.out.println("Thang vua nhap thuoc quy 2");
        else if(x == 7 || x == 8 || x == 9)
            System.out.println("Thang vua nhap thuoc quy 3");
        else
            System.out.println("Thang vua nhap thuoc quy 4");
    }
}
