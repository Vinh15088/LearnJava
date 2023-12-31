import java.util.Scanner;

public class B4 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();

        scanner.close();

        System.out.println("Trace:");

        if (isPrime(n)) System.out.println(n + " la so nguyen to");
        else System.out.println(n + " khong la so nguyen to");
    }
}