package Learn_Java;

public class Bai7_CacPhepToanCoBan {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 5;
//        System.out.println("a+b=" + (a+b));
//        System.out.println("a-b=" + (a-b));
//        System.out.println("a*b=" + (a*b));
//        System.out.println("a/b=" + (double)(a/b));
//        System.out.println("a%b=" + (double)(a%b));

        // Practice
        int i1 = 2, i2 = 5, i3 = -3;
        double d1 = 2, d2 = 5, d3 = -0.5;
        System.out.println("Cau a: " + i1+(i2*i3));
        System.out.println("Cau b: " + i1*(i2+i3));
        System.out.println("Cau c: " + (double) (i1/(i2+i3)));
        System.out.println("Cau d: " + (double) (i1/i2 + i3));
        System.out.println("Cau e: " + (double) (3 + 4 + 5/3));
        System.out.println("Cau f: " + (double) ((3+4+5)/3));
        System.out.println("Cau g: " + (double) (d1+(d2*d3)));
        System.out.println("Cau h: " + (double) (d1+d2+d3));
        System.out.println("Cau i: " + (double) (d1/d2 - d3));
        System.out.println("Cau k: " + (double) (d1/ ((d2-d3))));
        System.out.println("Cau l: " + (double) (d1 + d2 + d3/3));
        System.out.println("Cau m: " + (double) ((d1+d2+d3)/3));
        System.out.println("Cau n: " + (double) ((d1+d2 + (d3/3))));
        System.out.println("Cau o: " + (double) (3*(d1+d2)*(d1-d3)));
    }
}
