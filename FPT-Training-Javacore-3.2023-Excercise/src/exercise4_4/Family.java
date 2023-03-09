package exercise4_4;

import java.util.List;

public class Family {
    private int numberOfMember;
    private String address;
    private List<Person> personList;

    public Family(int numberOfMember, String address, List<Person> personList) {
        this.numberOfMember = numberOfMember;
        this.address = address;
        this.personList = personList;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Family{" +
                "numberOfMember=" + numberOfMember +
                ", address='" + address + '\'' +
                ", personList=" + personList +
                '}';
    }
}
