import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm tổng kết của sinh viên: ");
        double diem = scanner.nextDouble();

        String xepLoai = getXepLoai(diem);

        System.out.println("Xếp loại: " + xepLoai);
    }

    public static String getXepLoai(double diem) {
        if (diem < 2.0) return "Yếu";
        else if (diem >= 2.1 && diem <= 2.3) return "Trung bình";
        else if (diem >= 2.4 && diem <= 2.6) return "Khá";
        else if (diem >= 2.7 && diem <= 3.2) return "Giỏi";
        else return "Xuất sắc";
    }
}