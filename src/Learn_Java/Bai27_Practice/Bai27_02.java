package Bai27_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Bai27_02 {
    public static void main(String[] args) {
        // 1
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] mang = new int[n];
        for(int i=0; i<n; i++){
            int x = new Scanner(System.in).nextInt();
            mang[i] = x;
        }
        // 2
        System.out.print("Xuat cac gia tri trong mang la: ");
        for(int pt:mang){
            System.out.printf(pt + " ");
        }
        System.out.println("");
        // 3
        for(int i=0,j=n-1; i<j; i++,j--){
            int temp = mang[i];
            mang[i] = mang[j];
            mang[j] = temp;
        }
        System.out.print("Mang sau khi dao nguoc la: ");
        for(int pt:mang){
            System.out.printf(pt + " ");
        }
        System.out.println("");
        // 4
        Arrays.sort(mang);
        System.out.print("Mang sau khi sap xep tang dan la: ");
        for(int pt:mang){
            System.out.printf(pt + " ");
        }
        System.out.println("");
        //System.out.println(Arrays.toString(mang));

        // 5
        int sum = 0;
        for(int pt:mang){
            sum += pt;
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);

        // 6
        System.out.println("Hay nhap vao mot so bat ky: ");
        int x = new Scanner(System.in).nextInt();
        boolean check = false;
        String index = "";
        for(int i=0; i<n; i++){
            if(mang[i] == x) {
                check = true;
                index += (i + " ");
            }
        }
        if(check) System.out.println("Vi tri cua gia tri x vua nhap trong mang la: " + index);
        else System.out.println("Khong ton tai so x trong mang" );
    }
}
