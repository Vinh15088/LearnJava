package Bai17_Practice;

import java.util.Scanner;

public class Bai17_07 {
    public static void main(String[] args) {
        while(true){
            int a;
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi nhap vao 1 so nguyen a > 0: ");
            a = sc.nextInt();

            while(a<=0){
                System.out.println("Nhap lai a, a > 0: ");
                a = sc.nextInt();
            }

            int count = 0;
            for(int i=1; i<=a; i++){
                if(a%i==0) count++;
            }
            if(count == 2) System.out.println(a + " la so nguyen to");
            else System.out.println(a + " khong la so nguyen to");

            System.out.println("Ban co muon thoat chuong trinh khong? Bam y de thoat chuong trinh");
            String traloi = new Scanner(System.in).nextLine();
            if(traloi.equals("y") || traloi.equals("Y"))
                break;
        }

    }
}
