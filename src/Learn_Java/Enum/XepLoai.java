package Enum;

public enum XepLoai {
    gioi ("XL gioi"),  // 0
    kha ("XL kha"), // 1
    tb ("XL trung binh"), // 2
    yeu ("XL yeu"); // 3
    private String msg;
    XepLoai(String msg){
        this.msg = msg;
    }
    public String des(){
        return this.msg;
    }

}
