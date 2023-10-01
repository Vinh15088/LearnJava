package Learn_Java;

public class Bai18_ForFor {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("");
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(j == 1 || j == 7 || i==j) System.out.print(i + "" + j + "\t");
                else System.out.print("  " + "\t");
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("");

        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(i==1 || i==7 || j==1 || j==7) System.out.print(i + "" + j + "\t");
                else System.out.print("  " + "\t");
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("");

        for(int i=1; i<=7; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }
    }
}
