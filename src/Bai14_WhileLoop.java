import java.util.Scanner;

public class Bai14_WhileLoop {
    public static void main(String[] args) {
//        int x = 0;
//        while(x<=5){
//            System.out.println("x = " + x);
//            x++;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen tu 1-99: ");
        int n = sc.nextInt();
        while(n<1 || n>99){
            System.out.println("Vui long nhap lai n theo yeu cau (1-99): ");
            n = sc.nextInt();
        }
        System.out.println("Ban da nhap thanh cong n = " + n);
    }
}
