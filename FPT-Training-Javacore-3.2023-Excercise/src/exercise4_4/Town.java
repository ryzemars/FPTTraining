package exercise4_4;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private List<Family> familyList;

    public Town() {
        this.familyList = new ArrayList<>();
    }

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

    public void addFamily(Family family) {
        this.familyList.add(family);
    }

    @Override
    public String toString() {
        return "Town{" +
                "familyList=" + familyList +
                '}';
    }
}
