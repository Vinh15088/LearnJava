package Bai26_Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai26_1 {
    public static void main(String[] args) {
        System.out.println("Moi nhap vao chuoi: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int demSo = 0, demThuong = 0, demHoa = 0, demSpace = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))) demSo++;
            else if(Character.isLowerCase(s.charAt(i))) demThuong++;
            else if(Character.isUpperCase(s.charAt(i))) demHoa++;
            else demSpace++;
        }
        System.out.println("So luong ky tu in thuong: " + demThuong);
        System.out.println("So luong ky tu in hoa: " + demHoa);
        System.out.println("So luong ky tu so: " + demSo);
        System.out.println("So luong khoang trang: " + demSpace);
    }
}
