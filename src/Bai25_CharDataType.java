import java.util.Scanner;

public class Bai25_CharDataType {
    public static void main(String[] args) {
        // khai bao
        char ch = 'a';
        char ch2 = 66;
        System.out.println(ch2);

        char ch3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 ky tu: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println(ch4);

        // 3. compareTo: so sanh 2 ky tu => tra ve 1 so nguyen
        // ky tu giong nhau tra ve 0
        System.out.println(Character.compare('a', 'a'));
        // ky tu 1 truoc ky tu 2 trong bang ACII tra ve so am < 0
        System.out.println(Character.compare('A', 'a'));
        // => A=65, a = 97 => 65-97=-32
        // ky tu 1 sau ky tu 2 trong bang ACII tra ve so duong > 0
        System.out.println(Character.compare('a', 'A'));
        // => a = 97, A = 65 => 97-65=32

        // CHAR METHOD
        // Character.isDigit() => True neu la chu so
        // Character.isLetter() => True neu la chu cai
        // Character.isWhitespace() => True neu la khoang trong (space)
        // Character.isLowerCase() => True neu la ky tu thuong
        // Character.isUpperCase() => True neu la ky tu hoa
        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch5));
        System.out.println(Character.isWhitespace(ch5));
        System.out.println(Character.isUpperCase(ch5));
        System.out.println(Character.isLowerCase(ch5));
    }
}
