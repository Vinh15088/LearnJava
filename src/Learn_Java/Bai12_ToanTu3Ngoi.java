package Learn_Java;

import java.util.Scanner;

public class Bai12_ToanTu3Ngoi {
    public static void main(String[] args) {
        System.out.println("Nhap mot so n bat ky: ");
        int n = new Scanner(System.in).nextInt();

        String traloi = (n%2==0) ? "Chan" : "Le";
        System.out.println(traloi);
    }
}
