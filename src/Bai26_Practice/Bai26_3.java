package Bai26_Practice;

import java.util.Scanner;

public class Bai26_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        int count = 0;
        while(true){
            System.out.println("Moi thiet lap mat khau: ");
            String newPassword = sc.nextLine();
            if (check(newPassword)){
                password = newPassword;
                System.out.println("Mat khau moi da duoc thiet lap");
                break;
            }
            else {
                count++;
                System.out.println("Mat khau khong hop le, xin vui long nhap lai");
            }
            if(count == 5) {
                System.out.println("Ban da nhap sai 5 lan, dang nhap bi khoa");
                break;
            }
        }
    }

    // Kiem tra dieu kien mat khau
    public static boolean check(String password){
        if(password.length() < 6) return false;

        boolean hasLetter = false;
        for(char c:password.toCharArray()){
            if(Character.isLetter(c)){
                hasLetter = true;
                break;
            }
        }
        if(hasLetter == false) return false;

        boolean hasNumber = false;
        for(char c:password.toCharArray()){
            if(Character.isDigit(c)){
                hasNumber = true;
                break;
            }
        }
        if(hasNumber == false) return false;
        return true;
    }
}
