public class Bai21_Practice {
    public static void main(String[] args) {
        // 1 2 3
        // 1 2 1
        // 1 2 -3
        Pt2(1,2,3);
        System.out.println("");
        Pt2(1,2,1);
        System.out.println("");
        Pt2(1,2,-3);
    }

    public static void Pt2(int a, int b, int c){
        int delta = (int) Math.pow(b,2) - 4*a*c;
        if(delta < 0) System.out.println("Phuong trinh vo nghiem");
        else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem duy nhat la: ");
            System.out.println((double) -b/2*a);
        }
        else {
            System.out.println("Phuong trinh co 2 nghiem phan biet la: ");
            System.out.println((-b+Math.sqrt(delta))/2*a + " " + (-b-Math.sqrt(delta))/2*a);
        }
    }
}
