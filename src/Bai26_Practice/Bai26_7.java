package Bai26_Practice;

public class Bai26_7 {
    public static void main(String[] args) {
        String path = "D:/galailaptrinh/music/remix.mp3";
        int last = path.lastIndexOf("/");
        String fileName = path.substring(last+1);
        System.out.println(fileName);

        int last1 = path.lastIndexOf(".");
        String Name = path.substring(last+1, last1);
        System.out.println(Name);
    }
}
