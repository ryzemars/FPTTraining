package excercise3_3;

import java.util.Scanner;

public class CandidateManagementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Application Manager QanlySinhVien");
        System.out.println("Enter 1: To show information student");
        System.out.println("Enter 2: To search student by id");
        System.out.println("Enter 0: To exit!");
        CandidateManagement candidateManagement = new CandidateManagement();
        candidateManagement.addCandidate();

        byte choose = sc.nextByte();
        while (choose != 0) {
            switch (choose) {
                case 1:
                    candidateManagement.hienThiDanhSachSinhVien();
                    break;
                case 2:
                    candidateManagement.findById();
                    break;
                default:
                    System.out.println("Sai cu phap, nhap lai");
                    //sc.nextLine();
                    continue;
            }
            System.out.println("Application Manager QanlySinhVien");
            System.out.println("Enter 1: To show information student");
            System.out.println("Enter 2: To search student by id");
            System.out.println("Enter 0: To exit!");
            choose = sc.nextByte();
            // break;
        }
    }
}
