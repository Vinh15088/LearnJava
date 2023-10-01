package Bai28_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai28_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua list: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = new Scanner(System.in).nextInt();
            list.add(x);
        }
        for(int i=0; i<n; i++){
            int x = list.get(i);
            list.set(i,x*x);
        }
        System.out.println(list);
        int count = 0;
        for(int pt:list){
            if(pt>50) count++;
        }
        System.out.println("So phan tu lon hon 50 la: ");
        System.out.println(count);
    }
}
