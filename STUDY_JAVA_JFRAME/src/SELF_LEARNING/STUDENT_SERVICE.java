package SELF_LEARNING;

import java.util.ArrayList;

public class STUDENT_SERVICE {
    private ArrayList<Student> list;

    public STUDENT_SERVICE() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public void insert(Student std) {
        this.list.add(std);
    }
}
