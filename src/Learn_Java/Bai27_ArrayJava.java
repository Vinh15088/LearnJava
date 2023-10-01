import java.util.Arrays;

public class Bai27_ArrayJava {
    public static void main(String[] args) {
        // 1. khai bao mang
        String[] mangStr;
        int[] mangNguyen;
        boolean[] mangBool;

        // 2. khoi tao mang kem theo kich thuoc
        String[] mangStr2 = new String[15];
        int[] mangNguyen2 = new int[15];

        // 3. khoi tao mang kem theo gia tri ban dau
        String[] mangStr3 = new String[] {"chi pheo", "thi no", "ong giao"};
        int[] mangNguyen3 = new int[] {10, 15, 20};

        // 4. truy xuat phan tu cua mang qua vi tri index
        int[] mang4 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(mang4[0]);
        System.out.println(mang4[1]);
        System.out.println(mang4[2]);
        System.out.println(mang4[3]);

        // 5. Tra ve so phan tu cua mang
        System.out.println("Chieu dai mang4 la: " + mang4.length);

        // 6. Duyet mang
        // Cach 1: dung de xuat cac phan tu
        for(int pt:mang4) System.out.println(pt);

        // Cach 2: dung for duyet qua index
        for(int i=0; i<mang4.length; i++){
            System.out.print(i + " ");
            System.out.print(mang4[i]);
            System.out.println(" ");
        }

        // 7. Thay doi gia tri cho mang
        // Cach 1: goi truc tiep theo index de gan gia tri moi
        System.out.println(mang4[0]);
        mang4[0] = 99; // => thay doi gia tri thanh 99
        System.out.println(mang4[0]);

        // Cach 2: dung for de update toan bo
        int[] mang5 = {1,2,3,4,5};
        for(int i=0; i<mang5.length; i++) mang5[i] += 2;
        System.out.println("mang5 sau khi thay doi la: ");
        for(int pt:mang5) System.out.print(pt + " ");

        // 9.Sap xep mang
        int[] mang6 = {21, 10, 3, 9, 5};
        Arrays.sort(mang6);
        System.out.println(" ");
        System.out.println("Mang sau khi sap xep tang la: ");
        System.out.println(Arrays.toString(mang6));

        // 10. Dao nguoc mang
        int[] mang7 = {1, 10, 3, 9, 5};
        for(int i=0, j=mang7.length - 1; i<j; i++, j--){
            int temp = mang7[i];
            mang7[i] = mang7[j];
            mang7[j] = temp;
        }
        System.out.println("Mang sau khi dao nguoc la: ");
        System.out.println(Arrays.toString(mang7));


        // 11. Phep gan mang
        // Gan mang moi = mang da ton tai
        int[] mang8 = {1, 10, 3, 9, 5};
        int[] mang9 = mang8;
        // thay doi mang 8 tai vi tri 0
        mang8[0] = 101;
        System.out.println(Arrays.toString(mang8));
        System.out.println(Arrays.toString(mang9));


        // 12. Clone mang, tao mang moi cung gia tri
        int[] mang10 = {1, 10, 3, 9, 5};
        int[] mang11 = mang10.clone();
        // thay doi mang 8 tai vi tri 0
        mang10[0] = 101;
        System.out.println(Arrays.toString(mang10));
        System.out.println(Arrays.toString(mang11));
    }
}
