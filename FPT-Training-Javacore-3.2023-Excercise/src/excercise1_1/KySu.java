package excercise1_1;

import sun.nio.cs.ext.SJIS;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }

    @Override
    public void hienThiThongtinCanBo() {
        super.hienThiThongtinCanBo();
        System.out.println("nganh DT   : " + nganhDaoTao);
    }
}
