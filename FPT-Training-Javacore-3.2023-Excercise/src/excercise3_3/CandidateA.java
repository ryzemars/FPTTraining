package excercise3_3;

import java.util.ArrayList;
import java.util.List;

public class CandidateA extends Candidate{
//    public static final String TOAN = "Toan";
//    public static final String LY = "Ly";
//    public static final String HOA = "Hoa";
    private List<String> subjectList;

    public CandidateA(int id, String name, String address, int priority, List<String> subjects) {
        super(id, name, address, priority);
        this.subjectList = subjects;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    @Override
    public void getStudentInfor() {
        super.getStudentInfor();
        System.out.println("Mon thi     : " + getSubjectList());
    }

//    @Override
//    public String toString() {
//        return "CandidateA{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", priority=" + priority +
//                ", candidateList=" + candidateList +
//                '}';
//    }
}
