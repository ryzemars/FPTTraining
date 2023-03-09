package excercise1_1;

import java.util.Scanner;

public class QLCBMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Application Manager excercise1");
        System.out.println("Enter 1: To insert officer");
        System.out.println("Enter 2: To search officer by name");
        System.out.println("Enter 3: To show information officers");
        System.out.println("Enter 4: To delete!");
        System.out.println("Enter 0: To exit!");
        QLCB qlcb = new QLCB();
        byte choose = sc.nextByte();


        while (choose != 0) {
            switch (choose) {
                case 1:
                    qlcb.addCanBo();
                    break;
                case 2:
                    qlcb.timCanBoTheoTen();
                    break;
                case 3:
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 4:
                    qlcb.xoaCanBoTheoTen();
                    break;
                default:
                    System.out.println("Sai cu phap, nhap lai");
                    //sc.nextLine();
                    continue;
            }
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To delete!");
            System.out.println("Enter 0: To exit!");
            choose = sc.nextByte();
           // break;
        }
    }
}
