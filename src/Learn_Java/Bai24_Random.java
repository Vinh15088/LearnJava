package Learn_Java;

import java.util.Random;

public class Bai24_Random {
    public static void main(String[] args) {
        // khoi tao 1 doi tuong ngau nhien
        Random rd = new Random();
        int soNguyen = rd.nextInt(-50, 51);
        System.out.println(soNguyen);

        double soThuc = rd.nextDouble(-50, 51);
        System.out.println(soThuc);
    }
}
