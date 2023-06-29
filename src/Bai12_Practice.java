import java.util.Scanner;

public class Bai12_Practice {
    public static void main(String[] args) {
        System.out.println("Nhap vao diem trung binh cua hoc sinh: ");
        double dtb = new Scanner(System.in).nextDouble();
        String xepLoai = (dtb>=8) ? "Gioi" : (dtb>=6.5 && dtb<8) ? "Kha" :  (dtb>=5 && dtb<6.5) ? "Trung binh" : "Yeu";
        System.out.println(xepLoai);
    }
}
