package btvnbai4.bai6;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;


    // Constructor mặc định
    public Employee() {
        // Khởi tạo các giá trị mặc định hoặc để trống
    }

    // Constructor với tham số
    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public boolean getGen() {
        return gen;
    }

    public double getRate() {
        return rate;
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    // Phương thức nhập thông tin
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        employeeId = scanner.nextInt();
        scanner.nextLine(); // Đọc dấu xuống dòng sau khi đọc số nguyên
        System.out.println("Nhập tên nhân viên: ");
        employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Đọc dấu xuống dòng sau khi đọc số nguyên
        System.out.println("Nhập giới tính: (true la nam false la nu)");
        gen = scanner.nextBoolean();
        System.out.println("Nhập hệ số lương: ");
        rate = scanner.nextDouble();
    }

    // Phương thức tính lương
    public double getSalary() {
        return rate * 1300000;
    }

    // Phương thức hiển thị thông tin nhân viên
    public String toString() {
        return "[" +
                "=employeeId" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", gen=" + (gen ? "Nam" : "Nữ") +
                ", age='" + age + '\'' +
                ", rate=" + rate +
                ']';

    }
}


