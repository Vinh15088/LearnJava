import java.util.Scanner;

public class Bai11_CauLenhIfElse {
    public static void main(String[] args) {
        System.out.println("Hay nhap vao diem trung binh");
        double s = new Scanner(System.in).nextDouble();

        // Kiem tra dieu kien
//        if(s>5)
//            System.out.println("Dat yeu cau");
//        else
//            System.out.println("Khong dat yeu cau");

        if(s<=10 && s>=8)
            System.out.println("Xep loai gioi");
        else if (s>=6.5 && s<8)
            System.out.println("Xep loai kha");
        else if (s>=5 && s<6.5)
            System.out.println("Xep loai trung binh:");
        else
            System.out.println("Xep loai yeu");
    }
}
