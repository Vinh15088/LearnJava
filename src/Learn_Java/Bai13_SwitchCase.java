package Learn_Java;

import java.util.Scanner;

public class Bai13_SwitchCase {
    public static void main(String[] args) {
//        System.out.println("Nhap vao 1 so: ");
//        int a = new Scanner(System.in).nextInt();
//        int div = a%2;
//        switch (div){
//            case 0:
//                System.out.println(a + " la so chan");
//                break;
//            default:
//                System.out.println(a + " la so le");
//                break;

        System.out.println("Nhap vao 1 thang bat ky: ");
        int t = new Scanner(System.in).nextInt();
        switch (t){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay");
                break;
            case 2:
                System.out.println("Thang co 28 hoac 29 ngay");
                break;
            default:
                System.out.println("Khong co thang nay");
                break;
        }

    }
}
