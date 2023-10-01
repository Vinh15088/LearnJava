import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai28_ListJava {
    public static void main(String[] args) {
        // Collection Jave bao gom: Array list va HashMap

        // 1 Array list
        // Khai bao list
        ArrayList<Integer> list = new ArrayList<>();
        // Khai bao so luong phan tu ban dau (vi du 5 pt)
        ArrayList<Integer> list2 = new ArrayList<>(5);
        // Khoi tao cac phan tu co san
        ArrayList<Integer> list3 = new ArrayList<>(List.of(1,3,5,7,9));

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

        // 2 Cac phuong thuc cua Array list
        ArrayList<Integer> list4 = new ArrayList<>();
        // Add
        list4.add(7);
        list4.add(8);
        list4.add(11);
        // Add vao vi tri chi dinh: add(index, element)
        list4.add(1,99);
        // size: tra ve so phan tu cua list
        System.out.println("So phan tu cua list4 la: " + list4.size());
        // get(int index): tra ve gia tri list tai vi tri index
        System.out.println(list4.get(3));
        // remove(index): xoa phan tu tai vi tri chi dinh
        list4.remove(2);
        // remove (1 phan tu chi dinh)
        ArrayList<Integer> list5 = new ArrayList<>(List.of(1,2,3,4,5,6));
        list5.remove(Integer.valueOf(3));
        System.out.println(list5);
        // set(index,element): thay doi thong tin tai vi tri index
        list5.set(2,99);
        System.out.println(list5);
        // contains(): kiem qua collection co chua phan tu nao do hay khong
        boolean check = list5.contains(99);
        System.out.println(check);
        // Collections.sort(list): sap xep tang dan
        Collections.sort(list5);
        System.out.println(list5);
        // indexOf(): tim vi tri dau tien cua element trong list, neu khong ton tai tra ve -1
        System.out.println(list5.indexOf(99));

        // Duyet list
        ArrayList<Integer> list6 = new ArrayList<>(List.of(19,2,30,4,5,6,4));
        // duyet for
        for(int pt:list6){
            System.out.println(pt);
        }
        // su dung cac chi so index
        for(int i=0; i<list6.size(); i++){
            int value = list6.get(i);
            System.out.println(value);
        }
    }
}
