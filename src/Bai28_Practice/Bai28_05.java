package Bai28_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai28_05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 9, 3, 14, 5, 27, 8));
        ArrayList<Integer> list1 = new ArrayList<>(list);
        Collections.sort(list);
        System.out.println("So lon thu 2 trong list la: " + list.get(list.size()-2));
        System.out.println("So nho thu 2 trong list la: " + list.get(1));
        int soLonThu2 = list.get(list.size()-2);
        int soNhoThu2 = list.get(1);
        System.out.println("Vi tri index cua so lon thu 2 la: " + list1.indexOf(soLonThu2));
        System.out.println("Vi tri index cua so nho thu 2 la: " + list1.indexOf(soNhoThu2));
    }
}
