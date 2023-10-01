package Learn_Java;

import java.util.Scanner;

public class Bai13_Practice {
    public static void main(String[] args) {
        System.out.println("Moi bam so de lua chon:");
        System.out.println("1. tim theo ten");
        System.out.println("2. tim theo tac gia");
        System.out.println("3. tim theo nha xuat ban");
        System.out.println("4. tim theo tieu de");
        System.out.print("\n");
        int lc = new Scanner(System.in).nextInt();

        switch (lc){
            case 1:
                System.out.println("Tim theo ten");
                break;
            case 2:
                System.out.println("Tim theo tac gia");
                break;
            case 3:
                System.out.println("Tim theo nha xuat ban");
                break;
            case 4:
                System.out.println("Tim theo tieu de");
                break;
            default:
                System.out.println("Phim bam khong hop le!");
                break;
        }
    }
}
