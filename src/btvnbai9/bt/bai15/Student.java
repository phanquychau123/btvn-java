package btvnbai9.bt.bai15;

public class Student implements Comparable <Student> {
    private int studentId;
    private String name;
    private double averageScore;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(int studentId, String name, double averageScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        if (averageScore > o.getAverageScore()){
//            return 1;
//        } else if (averageScore == o.getAverageScore()) {
//            return 0;
//        } else  {
//            return -1;
//        }
//    }
        return (int)(averageScore * 100) - (int) (o.getAverageScore()*100);
    }
}
