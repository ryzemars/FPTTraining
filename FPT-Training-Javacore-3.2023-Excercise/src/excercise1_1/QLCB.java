package excercise1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    public List<CanBo> canBoList;

    public QLCB() {
        canBoList = new ArrayList<>();
    }

    //Nhap thong tin can bo
    public void addCanBo() {
        int sl;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong can bo muon them thong tin: ");
        sl = sc.nextInt();

        byte choose;
        CanBo canBo = new CanBo();
        for (int i = 0; i < sl; i++) {
            System.out.println("Nhap thong tin can bo " + (i + 1) +  " || Lua chon: 1-Cong nhan, 2-Ky su, 3-Nhan vien");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    canBo = new CongNhan();
                    break;
                case 2:
                    canBo = new KySu();
                    break;
                case 3:
                    canBo = new NhanVien();
                    break;
                default:
                    System.out.println("Nhap sai cu phap!");
                    i--;
                    break;
            }

            canBo.nhapThongTin();
            canBoList.add(canBo);
        }
    }

    //Tim can bo theo ten
    public void timCanBoTheoTen() {
        String tenCanTim;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten can bo muon tim: ");
        tenCanTim = sc.nextLine();

        for (CanBo canBo : canBoList) {
            if (canBo.getHoTen().equals(tenCanTim)) {
                canBo.hienThiThongtinCanBo(); //cach 1
                System.out.println(canBo.toString()); //cach 2
            }
        }

    }

    //Hien thi danh sach can bo
    public void hienThiDanhSachCanBo() {
        for (CanBo canBo : canBoList) {
            canBo.hienThiThongtinCanBo();
        }
    }

    //xoa can bo theo ten

    public void xoaCanBoTheoTen() {
        String tenMuonXoa;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten can bo muon xoa: ");
        tenMuonXoa = s.nextLine();

        //cach 1 - thong thuong
        for (CanBo canBo : canBoList) {
            if (tenMuonXoa.equals(canBo.getHoTen())) {
                canBo.xoaCanBo(); // phai viet ham xoa can bo o class CanBo
            }
        }

        //cach 2 - dung ->
        canBoList.removeIf(object -> tenMuonXoa.equals(object.getHoTen()));
        //cach 2: hoac ntn
        //canBoList.removeIf(object -> object.getHoTen().equals(tenMuonXoa));

    }
}
