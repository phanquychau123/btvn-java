import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem toan vao day");
        float diemtoan = Float.parseFloat(sc.nextLine());
        System.out.println("nhap diem ly");
        float diemli =Float.parseFloat(sc.nextLine());
        System.out.println("nhap diem hoa");
        float diemhoa =Float.parseFloat(sc.nextLine());
        System.out.println("nhap diem van");
        float diemvan =Float.parseFloat(sc.nextLine());
        System.out.println("nhap diem anh");
        float diemanh =Float.parseFloat(sc.nextLine());
        float diemtrungbinh = (diemanh+diemhoa+diemvan+diemli+diemtoan)/5;
        System.out.println("diem trung binh la:"+diemtrungbinh);
        if (diemtrungbinh<5){
            System.out.println("hoc sinh yeu");
        }else if (diemtrungbinh<6.5 && diemtrungbinh>=5){
            System.out.println("hoc sinh Tb");
        }else if (diemtrungbinh<8 && diemtrungbinh>=6.5){
            System.out.println("hoc sinh kha");
        }else if (diemtrungbinh<9 && diemtrungbinh>=8){
            System.out.println("hoc sinh gioi");
        }else {
            System.out.println("hoc sinh xuat sac");
        }
    }
}
