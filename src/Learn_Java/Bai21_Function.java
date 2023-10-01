package Learn_Java;

public class Bai21_Function {
    public static void main(String[] args) {
        System.out.println(tong(7,8,9));
        xinChao("male");
        xinChao("female");
    }

    public static int tong(int x, int y,int z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x+y+z;
    }

    public static void xinChao(String gioiTinh){
        if(gioiTinh.equals("female"))
            System.out.println("Xin chao, toi la nu");
        else if(gioiTinh.equals("male"))
            System.out.println("Xin chao toi la nam");
    }
}
