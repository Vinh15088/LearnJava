package Bai28_Practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai28_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua list: ");
        int n = sc.nextInt();
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = random.nextInt(1,101);
            list.add(x);
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(list.get(i) < 80){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("So phan tu trong list nho hon 80 la: ");
        System.out.println(count);
    }
}
