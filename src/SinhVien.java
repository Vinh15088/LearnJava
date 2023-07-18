public class SinhVien {
    // thuoc tinh
    private String Name;
    private double diem;

    public void hienThiThongTin(){
        System.out.println(Name + ": " + diem);
    }

    // Phuong thuc co kieu tra ve
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan + diemVan)/2;
    }

    // Constructor mac dinh
    public SinhVien(){
        Name = "No Name";
        diem = 0.0;
    }
    public SinhVien(String name) {
        this.Name = name;
    }

    public SinhVien(String name, double diem) {
        this.Name = name;
        this.diem = diem;
    }

    // get , set

    public String getName() {
        return Name;
    }

    public double getDiem() {
        return diem;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "Name='" + Name + '\'' +
                ", diem=" + diem +
                '}';
    }


    // Support Method, Service Method
    private boolean checkDiem(){
        return this.diem>=24;
    }

    public void checkHopLeDiem(){
        if(checkDiem() == true) System.out.println("Diem hop le!");
        else System.out.println("Kiem tra lai diem!");
    }


    // parameter list
    public double tongDiem(double...arr){
        double tong = 0.0;
        for(double x:arr){
            tong += x;
        }
        return tong;
    }
}
