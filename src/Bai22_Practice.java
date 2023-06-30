import java.util.Calendar;
import java.util.Scanner;

public class Bai22_Practice {
    public static void main(String[] args) {
        int day, month, year, tuoi;

        // Nhap du lieu tu ban phim
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay sinh: "); day = input.nextInt();
        System.out.println("Nhap thang sinh: "); month = input.nextInt();
        System.out.println("Nhap nam sinh: "); year = input.nextInt();

        Calendar birthday = Calendar.getInstance();

        birthday.set(year, month-1, day);

        // Xuat ngay/thang/nam sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay thang nam sinh: " + ngaySinh + "/" + (thangSinh+1) + "/" + namSinh);

        // Tinh tuoi
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);

        int tuoiHienTai;
        tuoiHienTai = namHienTai - namSinh;
        System.out.println(tuoiHienTai);
    }
}
