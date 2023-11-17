package btvnbai8.bt.bai15;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(new Student(1, "chau", 75.5));
        studentManagement.addStudent(new Student(2, "phat", 82.3));
        studentManagement.addStudent(new Student(3, "linh", 90.0));
        System.out.println("All Students:");
        studentManagement.showAll();
        studentManagement.removeStudent(2);
        System.out.println("\nAll Students after removal:");
        studentManagement.showAll();
        Student foundStudent = studentManagement.findStudentById(1);
        if (foundStudent != null) {
            System.out.println("\nFound Student: " + foundStudent.getName() + ", Average Score: " + foundStudent.getAverageScore());
        }
        System.out.println("\nAverage Score of All Students: " + studentManagement.getAverageScore());
        studentManagement.sortByScore();
        System.out.println("\nStudents Sorted by Score:");
        studentManagement.showAll();
    }

}
