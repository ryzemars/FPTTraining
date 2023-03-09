package excercise3_3;

import java.util.List;

public class CandidateC extends Candidate{
    private List<String> subjectList;

    public CandidateC(int id, String name, String address, int priority, List<String> subjects) {
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
}
