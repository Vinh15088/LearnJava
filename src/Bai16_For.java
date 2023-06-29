public class Bai16_For {
    public static void main(String[] args) {
        // In cac so chan tu 0-10
        for(int i=0; i<=10; i+=2)
            System.out.println("i = " + i);

        // Tong cac so chan tu 0-10
        int sum = 0;
        for(int i=0; i<=10; i+=2)
            sum += i;
        System.out.println(sum);
    }
}
