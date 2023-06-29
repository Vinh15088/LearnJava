package Bai17_Practice;

import java.util.Scanner;

public class Bai17_01 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen n: ");
        int n = new Scanner(System.in).nextInt();

        // dung vong for
//        int sum = 1;
//        for(int i=2; i<=n; i++){
//            sum *= i;
//        }
//        System.out.println("n! co ket qua la: " + sum);

        // dung while
        int sum = 1;
        int count = 1;
        while(count <= n){
            sum *= count;
            count++;
        }
        System.out.println("n! co ket qua la: " + sum);
    }
}
