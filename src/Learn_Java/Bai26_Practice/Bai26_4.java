package Bai26_Practice;

import java.util.Scanner;

public class Bai26_4 {
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String maHoa = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = a.indexOf(c);
            if(index == -1) maHoa += c;
            else maHoa += b.charAt(index);
        }
        System.out.println(maHoa);
    }
}
