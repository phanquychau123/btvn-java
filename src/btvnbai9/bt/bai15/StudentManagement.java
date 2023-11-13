package btvnbai9.bt.bai15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<>();
    }

    public void showAll() {
        for (Student student : studentList) {
            System.out.println("Student Id :" + student.getStudentId() +
                    ",Name:" + student.getName() +
                    ",Average Score : " + student.getAverageScore());
        }
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                studentList.remove(student);
                return;
            }
        }
    }
    public Student findStudentById(int studentId){
        for (Student student:studentList) {
            if (student.getStudentId()==studentId){
                return student;
            }
        }
        System.out.println("ko tim thay sinh vien co Id" + studentId);
        return null;
    }
    public double getAverageScore(){
        double totalScore = 0;
        for (Student student:studentList) {
            totalScore += student.getAverageScore();
        }
        return totalScore/ studentList.size();
    }
    public void sortByScore(){
        Collections.sort(studentList);
    }
}
