public class Bai26_3_StringJava {
    public static void main(String[] args) {
        // 2 chuoi giong nhau
        String s1 = "abcd13579";
        String s2 = "abcd13579";
        int x = s1.compareTo(s2);
        System.out.println(x);

        // 2 chuoi khac nhau, phan biet hoa thuong
        String s3 = "Abc13579";
        String s4 = "abc13579";
        // Trong bang ma ACII: A = 65; a = 97
        // 65-97 = -32
        int x2 = s3.compareTo(s4); // => tra ve -32
        System.out.println(x2);

        // 2 chuoi khac nhau, bo qua phan biet in thuong va in hoa
        String s5 = "Abc13579";
        String s6 = "abc13579";
        int x3 = s5.compareToIgnoreCase(s6);
        System.out.println(x3);


        // noi chuoi su dung StringBuilder
        StringBuilder s7 = new StringBuilder();
        StringBuilder s8 = new StringBuilder("Hom nay");
        // insert chem vao chuoi
        StringBuilder s9 = new StringBuilder("012345");
        s9.insert(2, "tuhoc.cc");
        System.out.println(s9);

        // them vao cuoi dung append
        StringBuilder s10 = new StringBuilder("1234");
        s10.append("tuhoc.cc");
        System.out.println(s10);

        // xoa tu start den end
        StringBuilder s11 = new StringBuilder("0123456789");
        s11.delete(1,3);
        System.out.println(s11);

        // dao nguoc chuoi
        StringBuilder s12 = new StringBuilder("123456789");
        s12.reverse();
        System.out.println(s12);

        // Trach chuoi tra ve mang
        String s13 = "Hello, World!";
        String[] mang = s13.split(",");
        for(int i=0; i<mang.length; i++) System.out.println(mang[i]);

        // tra ve chu thuong (lowercase), chu hoa (uppercase)
        String s14 = "Toi Dang Hoc Ngon Ngu Java";
        String s15 = s14.toLowerCase();
        System.out.println(s15);
        String s16 = s14.toUpperCase();
        System.out.println(s16);

        // Tach chuoi thanh tung ky tu cho vao mang
        String s17 = "abcdef123@";
        char[] mang2 = s17.toCharArray();
        for(int i=0; i<mang2.length; i++) System.out.print(mang2[i] + " ");
    }
}
