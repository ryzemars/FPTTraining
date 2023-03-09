package excercise1_1;

import java.util.Scanner;

public class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected Gender gioiTinh;
    protected String diaChi;

    public CanBo() {}

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Gender getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        if (gioiTinh == 0) {
            this.gioiTinh = Gender.valueOf("NAM");
        } else if (gioiTinh == 1) {
            this.gioiTinh = Gender.valueOf("NU");
        } else {
            this.gioiTinh = Gender.valueOf("KHAC");
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Nhap ho ten: ");
        String name = sc.nextLine();
        setHoTen(name);
        System.out.println("Nhap tuoi: ");
        setTuoi(sc.nextInt());
        System.out.println("Nhap gioi tinh (0 = nam, 1 = nu, 2 = khac)");
        int gt = sc.nextInt();
        setGioiTinh(gt);
        System.out.println("Nhap dia chi: ");
        diaChi = sc.next();
    }

    public void hienThiThongtinCanBo(){
        System.out.println("Ho ten     : " + getHoTen());
        System.out.println("Tuoi       : " + tuoi);
        System.out.println("Gioi tinh  : " + gioiTinh);
        System.out.println("Dia chi    : " + getDiaChi());
    }

    public void xoaCanBo() {

    }

    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
