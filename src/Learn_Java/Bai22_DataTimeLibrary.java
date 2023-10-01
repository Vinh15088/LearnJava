package Learn_Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai22_DataTimeLibrary {
    public static void main(String[] args) {
        // 1.Toan bo thong tin ngay thang nam gio...
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // 2.Lay thong tin ngay thang nam
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay hien tai: " + ngay);
        // Chu y: Thang chay tu 0-11=> cho nen phai +1 vao
        System.out.println("Thang hien tai: " + (thang+1));
        System.out.println("Nam hien tai: " + nam);

        // 3.Dat ngay thang nam theo y muon
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, 5);
        cal.set(Calendar.DAY_OF_MONTH, 12);
        // => Ktra ngay thang nam sau khi thay doi
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(ngaySinh + "/" + thangSinh + "/" + namSinh);

        // 4. Xuat theo dinh dang Ngay/Thang/Nam, gio phut giay
        // Tạo một đối tượng SimpleDateFormat với chuỗi định dạng dd/mm/yy
        // cần import java.text.SimpleDateFormat;
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh/mm/ss a");
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }


}
