package Learn_Java;

public class Bai17_Continue_Break {
    public static void main(String[] args) {
//        int tong = 0;
//        for(int i=0; i<=5; i++){
//            if(i==3)
//                continue;
//            else {
//                System.out.println("i = " + i);
//                tong += i;
//            }
//        }
//        System.out.println(tong);

        int n = 0;
        while(n<100){
            n++;
            System.out.println("n trong vong lap = " + n);
            if(n == 4)
                break;
        }
    }
}
