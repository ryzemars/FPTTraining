package excercise1_1;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nganh cong viec: ");
        congViec = sc.nextLine();
    }

    @Override
    public void hienThiThongtinCanBo() {
        super.hienThiThongtinCanBo();
        System.out.println("cong viec  : " + getCongViec());
    }
}
