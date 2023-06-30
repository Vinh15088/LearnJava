package Bai17_Practice;

public class Bai17_05 {
    public static void main(String[] args) {
        int sum = 1;
        for(int i=2; i<=10; i++){
            int sum1 = 1;
            for(int j=1; j<=i; j++){
                sum1 *= j;
            }
            sum += sum1;
        }
        System.out.println("Tong can tinh co ket qua la: " + sum );
    }
}
