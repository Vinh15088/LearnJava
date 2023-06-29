package Bai17_Practice;

import java.util.Scanner;

public class Bai17_02 {
    public static void main(String[] args) {
        System.out.println("Nhap mot so a: ");
        int a = new Scanner(System.in).nextInt();
        int sum = 0;
        if(a%2==0) {
            for(int i=2; i<=a; i+=2){
                sum += i;
            }
            System.out.println("Tong cac so chan tu 0-a la: " + sum);
        }
        else {
            System.out.println("Toi khong tinh tong so le, bye bye");
        }
    }
}
