import java.util.HashMap;
import java.util.Scanner;

public class Bai29_Practice {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "123456");
        users.put("user2", "123456");
        users.put("user3", "123456");
        users.put("user4", "123456");
        users.put("user5", "123456");
        users.put("user6", "123456");
        users.put("user7", "123456");
        users.put("user8", "123456");
        users.put("user9", "123456");
        users.put("user10", "123456");
        System.out.println("Nhap username dang nhap: ");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Nhap password: ");
        String password = new Scanner(System.in).nextLine();
        boolean check = users.containsKey(username);
        if(check == false){
            System.out.println("user khong ton tai!");
        }
        else {
            boolean check2 = users.containsValue(password);
            if(check2 == false){
                System.out.println("password sai!");
            }
            else System.out.println("Dang nhap thanh cong");
        }
    }
}
