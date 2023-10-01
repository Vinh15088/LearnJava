package Learn_Java;

public class Bai26_2_StringJava {
    public static void main(String[] args) {
        // indexof => kiem tra vi tri xuat hien dau tien cua ky tu hoac chuoi, khong thay tra ve -1
        // LastIndexOf => Tra ve vi tri index xuat hien cuoi cung cua ky tu hoac chuoi, khong thay tra ve -1
        // contains => kiem tra chuoi con
        // substring => Lay mot chuoi con tu mot chuoi dai hon (substring(int beginIndex, int endIndex)
        String s = "Toi la ai";
        System.out.println(s.indexOf("Toi"));
        System.out.println(s.lastIndexOf("Toi"));

        // contains
        String s1 = ".mp3";
        String s2 = "tuhoc.mp3";
        boolean check = s2.contains(s1);
        if(check) System.out.println("Co .mp3 trong chuoi");
        else System.out.println("Khong tim thay .mp3 trong chuoi");

        // substring
        String s3 = "abcdejgh";
        String s4 = s3.substring(0,3);
        System.out.println(s4);
        String s5 = s3.substring(3);
        System.out.println(s5);


        // replace("str old", "str new") => thay the toan bo chuoi old bang chuoi new
        String s6 = "hoc hoc nua hoc mai";
        String s7 = s6.replace("hoc", "ngu");
        System.out.println(s6);
        System.out.println(s7);

        // replaceFirst("str old", "str new") => thay the chuoi old dau tien tim thay bang chuoi new
        String s8 =s6.replaceFirst("hoc", "ngu");
        System.out.println(s8);


        // trim() => xoa toan bo khoang trang o dau va cuoi
        String s9 = "        hehe haha huhu       ";
        String s10 = s9.trim();
        System.out.println(s9);
        System.out.println(s10);


        // trim(): xoa toan bo khoang trang o cuoi
        // Cach 1: bieu thuc chinh quy (regular expression)
        // dung \s+$ de xoa tat ca cac khoang trang o cuoi chuoi
        String s11 = s9.replaceAll("\\s+$", "");
        System.out.println(s11);
        // Giai thich: \s+ => mot hoac nhieu khoang trang lien tiep
        // $ => ket thuc dong
        // \s+$ => mot hoac nhieu khoang trang lien tiep ngay truoc khi ket thuc dong

        // xoa toan bo khoang trang o dau
        String s12 = s9.replaceFirst("^\\s+", "");
        System.out.println(s12);

        // Co the loai bo khoang trang o dau hoac cuoi cua chuoi, bang viec su dung vong lap While
    }
}
