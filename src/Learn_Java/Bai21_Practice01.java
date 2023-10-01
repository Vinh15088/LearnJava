package Learn_Java;

import java.util.Scanner;

public class Bai21_Practice01 {
    public static void main(String[] args) {
        Solve();
    }

    public  static void Solve(){
        System.out.println("Moi nhap vao so a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Moi nhap vao so b: ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Moi nhap vao phep tinh (+,-,*,/): ");
        String s = new Scanner(System.in).nextLine();
        if(s.equals("+")) System.out.println("Ket qua = " + (a+b));
        else if(s.equals("-")) System.out.println("Ket qua = " + (a-b));
        else if(s.equals("*")) System.out.println("Ket qua = " + (a*b));
        else if(s.equals("/")) System.out.println("Ket qua = " + (double) (a/b));
    }
}
