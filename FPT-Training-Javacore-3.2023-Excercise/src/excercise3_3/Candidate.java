package excercise3_3;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
    protected int id;
    protected String name;
    protected String address;
    protected int priority;

    List<Candidate> candidateList;

    public Candidate() {
    }

    public Candidate(int id, String name, String address, int priority) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

//    public void initializeCandidate() {
//        Candidate candidate1 = new Candidate();
//        Candidate candidate2 = new Candidate();
//        Candidate candidate3 = new Candidate();
//
//        candidate1.setId(1);
//        candidate1.setName("Mai");
//        candidate1.setAddress("HN");
//        candidate1.setPriority(1);
//
//        candidate2.setId(2);
//        candidate2.setName("Dat");
//        candidate2.setAddress("HD");
//        candidate2.setPriority(2);
//
//        candidate3.setId(3);
//        candidate3.setName("Hung");
//        candidate3.setAddress("HP");
//        candidate3.setPriority(3);
//    }

    public void getCandidateInformation() {
        System.out.println("Thong tin candidate: ");
        for (Candidate candidate : candidateList) {
            System.out.println(candidate.toString());
        }
    }

    public void getStudentInfor(){
        System.out.println("ID     : " + getId());
        System.out.println("Ten       : " + getName());
        System.out.println("Dia chi  : " + getAddress());
        System.out.println("Uu Tien    : " + getPriority());
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }
}
