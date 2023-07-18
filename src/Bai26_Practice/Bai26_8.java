package Bai26_Practice;

import java.util.Scanner;

public class Bai26_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao mot chuoi bat ky: ");
        String str = sc.nextLine();
        String s = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(s)) System.out.println("Chuoi nhap vao doi xung");
        else System.out.println("Chuoi nhap vao khong doi xung");
    }
}
