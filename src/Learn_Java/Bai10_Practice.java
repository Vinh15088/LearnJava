package Learn_Java;

import java.util.Scanner;

public class Bai10_Practice {
    public static void main(String[] args) {
        System.out.println("Hay nhap gia tri ban kinh r: ");
        double r = new Scanner(System.in).nextDouble();
        double cv = 2*Math.PI*r;
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Chu vi = " + cv);
        System.out.printf("Dien tich = " + dt);
    }
}
