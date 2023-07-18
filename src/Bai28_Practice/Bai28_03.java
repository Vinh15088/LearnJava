package Bai28_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai28_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> quest = new ArrayList<>(List.of(
                "2 + 5 + 7 =",
                "5 * 10 =",
                "sqrt(16) =",
                "12 % 2 ="
        ));
        ArrayList<Float> Answer = new ArrayList<>(List.of(14f, 50f, 4f, 0f));
        for(int i=0; i<quest.size(); i++){
            System.out.println(quest.get(i));
            System.out.println("Nhap ket qua: ");
            Float kqua = sc.nextFloat();
            if(kqua.equals(Answer.get(i))) System.out.println("Dung cmnl");
            else System.out.println("Sai roi!");
        }
    }
}
