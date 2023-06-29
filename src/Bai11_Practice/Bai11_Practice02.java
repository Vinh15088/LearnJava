package Bai11_Practice;

import java.util.Scanner;

public class Bai11_Practice02 {
    public static void main(String[] args) {
        System.out.println("Nhập chiều cao của bạn (m): ");
        double chieuCao = new Scanner(System.in).nextDouble();
        System.out.println("Nhap can nang cua ban (kg): ");
        int canNang = new Scanner(System.in).nextInt();

        double BMI = (double) canNang/(Math.pow(chieuCao,2));

        if(BMI < 15)
            System.out.println("Thân hình quá gầy");
        else if(BMI >= 15 && BMI < 16)
            System.out.println("Thân hình gầy");
        else if(BMI >= 16 && BMI < 18.5)
            System.out.println("Thân hình hơi gầy");
        else if(BMI >= 18.5 && BMI < 25)
            System.out.println("Thân hình bình thường");
        else if(BMI >= 25 && BMI < 30)
            System.out.println("Thân hình hơi béo");
        else if(BMI >= 30 && BMI < 35)
            System.out.println("Thân hình béo");
        else
            System.out.println("Thân hình quá béo");
    }
}
