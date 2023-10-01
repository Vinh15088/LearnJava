package Learn_Java;

public class Bai9_ToanTuLogic {
    public static void main(String[] args) {
        int i = 7;
        // kiem tra i >0 va i<10 hay khong?
        System.out.println(i>0 && i<10);

        // kiem tra i>10 hoac i<-1
        System.out.println(i>10 || i<-1);

        // phu dinh
        System.out.println(!(i>10 || i<-1));


        // Toan tu tien to, hau to
        int x = 100;
        int y = 90;
        int z = 80;
        int t = 70;

        x++;
        ++y;
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);

        // Độ ưu tiên của Postfix và Prefix
        // Step 1: prefix
        // Step 2: các phép toán còn lại
        // Step 3: gán giá trị cho biến ở bên trái dấu bằng
        // Step 4: tính postfix

        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a); // 2
        System.out.println(b); // 3
        System.out.println(c); // -1

        // Giải thích
        // Step 1: ++b => b = 3;
        // Step 2: a = 1, b = 3 => 1-3+1 = -1
        // Step 3: c = -1;
        // Step 4: a++ => a = 2;
    }
}
