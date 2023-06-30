package Bai17_Practice;

import java.util.Scanner;

public class Bai17_03 {
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so nguyen bat ky: ");
        int n = new Scanner(System.in).nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0) continue;
            else {
                if(i==3) continue;
                else sum += i;
            }
        }
        System.out.println(sum);
    }
}
