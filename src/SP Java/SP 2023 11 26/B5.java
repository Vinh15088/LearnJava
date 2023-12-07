import java.util.Scanner;

public class B5 {
    public static int tinhTongSoNguyenDuong(double[] arr) {
        int tong = 0;
        for (double num : arr) {
            if (num > 0 && num == (int) num) tong += (int) num;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        scanner.close();

        int tong = tinhTongSoNguyenDuong(arr);
        System.out.println("Tong cac so nguyen duong cua mang la: " + tong);
    }
}