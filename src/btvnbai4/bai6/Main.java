package btvnbai4.bai6;

import java.util.Scanner;

public class Main {
    private  static Employee[] employees = new Employee[100]; // Tạo mảng .. đối tượng Employee
    private  static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("quan li Employees");
            System.out.println("1. Hiển thị danh sách \n" +
                    "2. Thêm mới \n" +
                    "3. Update thông tin theo id\n" +
                    "4. Xoá theo id\n" +
                    "5. Thoát\n");
            System.out.println("nhap lua chon cua ban");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    //hien thi
                    showEmployees();
                    break;
                case 2 :
                    //themmoi
                    createEmployee();
                    break;
                case 3 :
                    //Update thong tin
                    System.out.println("nhap id can sua");
                    int idEdit = sc.nextInt();
                    updateEmployees(idEdit);
                    break;
                case 4 :
                    //xoa
                    System.out.println("nhap id can xoa");
                    int idDelete = sc.nextInt();
                    deleteEmployees(idDelete);
                    break;
                case 5 :
                    //thoat
                    close();
                    break;
            }
        }

    }
    public static void showEmployees(){
        if (count == 0){
            System.out.println("chua co nguoi dung");
        }
        for (int i = 0;i < count;i++){
            System.out.println(employees[i]);
        }
    }
    public static void createEmployee(){
       Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien can them moi");
        int quantity = sc.nextInt();
        if (quantity > employees.length - count ){
            System.out.println("vuot qua so luong cho phep");
            return;
        }
        for (int i = 0; i < quantity; i++){
            Employee employee = new Employee();
            System.out.println("nhap thong tin nguoi thu "+(i+1));
            System.out.println("nhap id");
            employee.setEmployeeId(sc.nextInt());
            sc.nextLine();
            System.out.println("nhap ten sinh vien");
            employee.setEmployeeName(sc.nextLine());
            System.out.println("nhap gioi tinh true(nam) false(nu)");
            employee.setGen(sc.nextBoolean());
            System.out.println("nhap tuoi");
            employee.setAge(sc.nextInt());
            System.out.println("nhap he so luong");
            employee.setRate(sc.nextDouble());
            employees[count++] = employee;
        }
        System.out.println("them moi thanh cong");
    }
    public static void updateEmployees(int employeesId){
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("nhap ten sinh vien");
        employee.setEmployeeName(sc.nextLine());
        System.out.println("nhap gioi tinh nam/nu");
        employee.setGen(sc.nextBoolean());
        System.out.println("nhap tuoi");
        employee.setAge(sc.nextInt());
        System.out.println("nhap he so luong");
        employee.setRate(sc.nextDouble());
        for (int i = 0;i < count;i++ ){
            if (employees[i].getEmployeeId() == employeesId){
                employees[i].setEmployeeName(employee.getEmployeeName());
                employees[i].setAge(employee.getAge());
                employees[i].setGen(employee.getGen());
                employees[i].setRate(employee.getRate());
            }
        }
    }
    public static void deleteEmployees(int idDelete){
        int index = getIndexByEmployeesId(idDelete);
        if(index==-1){
            System.out.println("Không tìm thấy nguoi dung nào phù hợp");
            return;
        }

        // cho phép xóa
        for (int i = index+1; i <count ; i++) {
            employees[i-1] = employees[i];
        }
       employees[count-1]= null;
        count--;
        System.out.println("Xóa thành công");
    }
    public static int getIndexByEmployeesId(int id) {
        for (int i = 0; i < count; i++) {
            if (id == employees[i].getEmployeeId()) {
                return i;
            }
        }
        return -1;
    }
    public static void close(){
        System.exit(0);
    }
}

