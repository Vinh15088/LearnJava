import java.util.Scanner;

public class B3 {
    public static int findLargest(int a, int b, int c) {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();

        System.out.print("Nhap so c: ");
        int c = scanner.nextInt();

        scanner.close();

        int largestNumber = findLargest(a, b, c);
        System.out.println("So lon nhat la: " + largestNumber);
    }
}
