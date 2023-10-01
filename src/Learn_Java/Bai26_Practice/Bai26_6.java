package Bai26_Practice;

import java.util.Scanner;

public class Bai26_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String Digit = "", Letter = "";
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))) Digit += s.charAt(i);
            if(Character.isLetter(s.charAt((i)))) Letter += s.charAt(i);
        }
        System.out.println("Hai chuoi duoc tach ra la: " + Letter + " " + Digit);
    }
}
