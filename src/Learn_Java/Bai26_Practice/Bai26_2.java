package Bai26_Practice;

public class Bai26_2 {
    public static void main(String[] args) {
        String strl = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0, count = 0;
        String[] parts = strl.split(" ");
        for(String part:parts){
            if(part.matches("\\d+")) {
                sum += Integer.parseInt(part);
                count++;
            }
        }
        System.out.println("Tong cua cac so la: " + sum);
        System.out.println("Trung binh cong cua cac so la: " + (double) sum/count);

    }
}
