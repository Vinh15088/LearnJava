import java.util.HashMap;

public class Bai29_HashMapJava {
    public static void main(String[] args) {
        // 1 Khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map2 = new HashMap<>();


        // 2 Cac phuong thuc cua HashMap
        // put(key, value): them 1 phan tu theo cap key, value
        // get(key): truy xuat gia tri thong qua key
        // remove(key): xoa 1 phan tu (xoa ca cap key, value)
        // containsKey(key): kiem tra xem key co ton tai trong hashmap
        // containsValue(Value): kiem tra xem value co ton tai trong hashmap
        // isEmpty(): kiem tra xem hashmap co rong hay khong
        // size(): kiem tra so luong phan tu trong hashmap

        // 2.1 put(key, value)
        map.put(2, "apple");
        map.put(5, "banana");
        map.put(3, "cherry");
        map.put(4, "orange");

        // 2.2 get(key)
        String value = map.get(2);
        String value2 = map.get(3);
        String value3 = map.get(4);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

        // 2.3 remove(key)
        map.remove(2);
        System.out.println(map);

        // 2.4 containsKey(key)
        boolean check = map.containsKey(2);
        System.out.println(check);

        // 2.5 containsValue(value)
        boolean check2 = map.containsValue("banana");
        System.out.println(check2);

        // 2.6 isEmpty()
        boolean check3 = map.isEmpty();
        System.out.println(check3);

        // 2.7 size()
        System.out.println(map.size());

        // 2.8 Duyet hashmap
        for(Integer key:map.keySet()){
            String vl = map.get(key);
            System.out.println(key + ": " + vl);
        }
    }
}
