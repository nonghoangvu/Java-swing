/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student_Service;

import java.util.ArrayList;

/**
 *
 * @author NONG HOANG VU
 */
public class StudentService {
    private ArrayList<Student> list;

    public StudentService() {
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

    public void remove(int index) {
        this.list.remove(index);
    }

    public void change(int index, Student student) {
        this.list.set(index, student);
    }
}
