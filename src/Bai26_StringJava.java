public class Bai26_StringJava {
    public static void main(String[] args) {
        String a = "Thang ranh con nay" + "\nAo that day";
        System.out.println(a);


        // append(string) => them string vao cuoi chuoi goc
        // insert(index, string) => chen string tu vi tri index
        // delete(start, end) => xoa tat ca cac ky tu tu vi tri start den vi tri (end-1)
        // string.length() => tra ve do dai cua chuoi tinh ca space
        StringBuilder chuoi = new StringBuilder();
        chuoi.append("Xin chao. ");
        chuoi.append("Minh dang hoc Java,");
        chuoi.append("va no khong kho nhu minh nghi");
        System.out.println(chuoi);

        chuoi.insert(3, " hehe");
        System.out.println(chuoi);

        chuoi.delete(0, 5);
        System.out.println(chuoi);

        System.out.println(chuoi.length());
    }
}
