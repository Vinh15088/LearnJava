package Learn_Java;

import java.util.Scanner;

public class Bai10_Practice02 {
    public static void main(String[] args) {
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        double b = new Scanner(System.in).nextDouble();

        double s = a*b;
        double p = (a+b)*2;

        System.out.println("Chu vi va Dien tich hinh chu nhat la: " + p + " " + s);
    }
}
