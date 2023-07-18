package Bai28_Practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai28_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int random = rd.nextInt(1,101);
            list.add(random);
        }
        // In ds
        System.out.print(list + " ");
    }
}
