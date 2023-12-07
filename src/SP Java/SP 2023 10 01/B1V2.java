import java.util.Scanner;

public class B1V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài cạnh a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập độ dài cạnh b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập độ dài cạnh c: ");
        double c = scanner.nextDouble();

        if (isTriangle(a, b, c)) {
            String triangleType = getTriangleType(a, b, c);
            System.out.println("Các cạnh đã nhập tạo thành một tam giác " + triangleType);
        } else {
            System.out.println("Các cạnh đã nhập không tạo thành một tam giác");
        }
    }

    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String getTriangleType(double a, double b, double c) {
        String triangleType;

        if (a == b && b == c) {
            triangleType = "đều";
        } else if (a == b || a == c || b == c) {
            triangleType = "cân";
        } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
            triangleType = "vuông";
        } else {
            triangleType = "thường";
        }

        switch (triangleType) {
            case "đều":
                return "tam giác đều";
            case "cân":
                return "tam giác cân";
            case "vuông":
                return "tam giác vuông";
            case "thường":
                return "tam giác thường";
            default:
                return "loại tam giác không xác định";
        }
    }
}