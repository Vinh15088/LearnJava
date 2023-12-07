import java.util.Scanner;

public class B2V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm tổng kết của sinh viên: ");
        double diem = scanner.nextDouble();

        String xepLoai = getXepLoai(diem);

        System.out.println("Xếp loại: " + xepLoai);
    }

    public static String getXepLoai(double diem) {
        int key;
        if (diem < 2.0) key = 0;
        else if (diem >= 2.1 && diem <= 2.3) key = 1;
        else if (diem >= 2.4 && diem <= 2.6) key = 2;
        else if (diem >= 2.7 && diem <= 3.2) key = 3;
        else key = 4;

        switch (key) {
            case 0:
                return "Yếu";
            case 1:
                return "Trung bình";
            case 2:
                return "Khá";
            case 3:
                return "Giỏi";
            case 4:
                return "Xuất sắc";
            default:
                return "Trường hợp không xảy ra";
        }
    }
}