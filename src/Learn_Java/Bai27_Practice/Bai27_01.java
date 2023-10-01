package Bai27_Practice;

import java.util.Scanner;

public class Bai27_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so phan tu toi da cua mang: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for(int i=0; i<n; i++){
            mang[i] = sc.nextInt();
        }
        for(int pt:mang) System.out.print(pt + " ");
    }
}
