package Bai26_Practice;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Bai26_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao mot chuoi bat ky: ");
        String s = sc.nextLine();
        System.out.println(ChuanHoa(s));
    }

    public static String ChuanHoa(String input){
        input = input.trim(); // xoa toan bo khoang trang o dau va cuoi
        String[] words = input.split("\\s+");
        for(int i=0; i<words.length; i++){
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ", words); // Moi tu cach nhau mot khoang trangg
    }
}
