package Bai26_Practice;

public class Bai26_5 {
    public static void main(String[] args) {
        String a = "Toi cham hoc, toi chiu kho, toi dep trai";
        String b = a.toLowerCase();
//        System.out.println(b);
        String[] words = b.split(" ");
        int count = 0;
        for(String word:words){
            if(word.equals("toi")) count++;
        }
        System.out.println(count);
    }
}
