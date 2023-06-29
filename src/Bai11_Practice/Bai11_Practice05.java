package Bai11_Practice;

import java.util.Scanner;

public class Bai11_Practice05 {
    public static void main(String[] args) {
        System.out.println("Nhap 3 gia tri cua phuong trinh bac 2 la: ");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        int delta = (int) (Math.pow(b,2) - 4*a*c);

        if(delta < 0)
            System.out.println("Phuong trinh vo nghiem");
        else if(delta == 0){
            System.out.println("Phuong trinh co nghiem duy nhat la: ");
            double x0 = (double) -b/(2*a);
            System.out.println(x0);
        }
        else {
            System.out.println("Phuong trinh co 2 nghiem la: ");
            double x1 = (double) ((-b+Math.sqrt(delta))/(2*a));
            double x2 = (double) ((-b-Math.sqrt(delta))/(2*a));
            System.out.println(x1 + " " + x2);
        }

    }
}
