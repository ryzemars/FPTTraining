package excercise3_3;

import excercise1_1.CanBo;
import excercise1_1.CongNhan;
import excercise1_1.KySu;
import excercise1_1.NhanVien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CandidateManagement {
    public List<Candidate> candidateList;

    public CandidateManagement() {
        candidateList = new ArrayList<>();
    }

    //Add thong tin candidate
    public void addCandidate() {
//        List<String> subjectsA = new ArrayList<>();
//        subjectsA.add("Toan");
//        subjectsA.add("Ly");
//        subjectsA.add("Hoa");
        List<String> subjectsA = Arrays.asList("TOAN", "Ly", "Hoa");
        Candidate candidateA = new CandidateA(1, "dat", "Haiduong", 1, subjectsA);

//        List<String> subjectsB = new ArrayList<>();
//        subjectsB.add("Toan");
//        subjectsB.add("Hoa");
//        subjectsB.add("Sinh");
        List<String> subjectsB = Arrays.asList("TOAN", "Sinh", "Hoa");
        Candidate candidateB = new CandidateB(2, "oanh", "Haiduong", 1, subjectsB);

//        List<String> subjectsC = new ArrayList<>();
//        subjectsC.add("Van");
//        subjectsC.add("Su");
//        subjectsC.add("Dia");
        List<String> subjectsC = Arrays.asList("VAN", "Su", "Dia");
        Candidate candidateC = new CandidateA(1, "hien", "Haiduong", 1, subjectsC);

        candidateList.add(candidateA);
        candidateList.add(candidateB);
        candidateList.add(candidateC);
//        int sl;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so luong candidate muon them thong tin: ");
//        sl = sc.nextInt();
//
//        byte choose;
//        Candidate candidate = new Candidate();
//        for (int i = 0; i < sl; i++) {
//            System.out.println("Nhap thong tin ung vien " + (i + 1) +  " || Lua chon: 1-Candidate A, 2-Candidate B, 3-Candidate C");
//            choose = sc.nextByte();
//            switch (choose) {
//                case 1:
//                    candidate = new CandidateA();
//                    break;
//                case 2:
//                    candidate = new CandidateB();
//                    break;
//                case 3:
//                    candidate = new CandidateC();
//                    break;
//                default:
//                    System.out.println("Nhap sai cu phap!");
//                    i--;
//                    break;
//            }
//            candidate.initializeCandidate();
//            candidateList.add(candidate);
//        }
    }

    //Tim candidate theo id
    public void findById() {
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextInt();

        for (Candidate candidate : candidateList) {
            if (candidate.getId() == id) {
                //candidate.getCandidateInformation(); //cach 1
                //System.out.println(candidate.toString()); //cach 2
                candidate.getStudentInfor();//cach3
            }
        }

    }

    //Hien thi danh sach sinh vien
    public void hienThiDanhSachSinhVien() {
        for (Candidate candidate : candidateList) {
            candidate.getStudentInfor();
        }
    }
}
