import java.util.Scanner;

public class bt2 {
    static double vnd = 23000;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien usd");
        double usd = sc.nextDouble();
        double vndexchange=vnd*usd;
        System.out.println("so tien chuyen doi qua vnd la" + vndexchange + "vnd");
    }
}
