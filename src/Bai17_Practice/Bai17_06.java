package Bai17_Practice;

public class Bai17_06 {
    public static void main(String[] args) {
        for(int i=1; i<=1000; i++){
            int sum = 0;
            for(int j=1; j<i; j++){
                if(i%j==0) sum += j;
            }
            if(sum == i) System.out.printf(i + " ");
        }
    }
}
