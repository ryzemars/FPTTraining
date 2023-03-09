package excercise1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bacCongNhan;

    public String getBacCongNhan() {
        return bacCongNhan;
    }

    public void setBacCongNhan(int insertBac) {
        switch (insertBac) {
            case 1:
                bacCongNhan = "Bac 1";
                break;
            case 2:
                bacCongNhan = "Bac 2";
                break;
            case 3:
                bacCongNhan = "Bac 3";
                break;
            case 4:
                bacCongNhan = "Bac 4";
                break;
            case 5:
                bacCongNhan = "Bac 5";
                break;
            case 6:
                bacCongNhan = "Bac 6";
                break;
            case 7:
                bacCongNhan = "Bac 7";
                break;
            case 8:
                bacCongNhan = "Bac 8";
                break;
            case 9:
                bacCongNhan = "Bac 9";
                break;
            case 10:
                bacCongNhan = "Bac 10";
                break;
            default:
                System.out.println("sai cu phap");
                break;
        }
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        int insertBac = 0;
        System.out.println("Nhap bac cong nhan (tu 1-10)");
        boolean bError = true;
        while (bError) {

            if (sc.hasNextInt()) {
                insertBac = sc.nextInt();
                if (insertBac >= 1 && insertBac <= 10) {
                    setBacCongNhan(insertBac);
                } else {
                    System.out.println("Sai dieu kien, nhap lai");
                    //sc.next();
                    continue;
                    //insertBac = sc.nextInt();
                    //sc.nextInt();
                }
            } else {
                System.out.println("Sai cu phap, nhap vao so!!");
                sc.next();
                continue;
            }
            bError = false;
        }


//        do {
//            try {
//                if (insertBac >= 1 && insertBac <= 10) {
//                    setBacCongNhan(insertBac);
//                } else {
//                    System.out.println("Sai dieu kien");
//                    insertBac = sc.nextInt();
//                    //sc.nextInt();
//                }
//            } catch (InputMismatchException ime) {
//                System.out.println("Sai cu phap, nhap lai");
//                insertBac = sc.nextInt();
//                //sc.reset();
//            }
//        } while (insertBac < 1 || insertBac > 10);

    }

    @Override
    public void hienThiThongtinCanBo() {
        super.hienThiThongtinCanBo();
        System.out.println("Bac CN     : " + bacCongNhan);
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                ", bacCongNhan='" + bacCongNhan + '\'' +
                '}';
    }
}
