import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can kiem tra");
        int number = Integer.parseInt(sc.nextLine());
        String str = new String("chia het cho ");
        if (number % 3 == 0 && number % 5==0) {
            System.out.println( str + " 3 va 5");
        } else if (number % 3== 0 && number % 5 != 0){
            System.out.println(str + "3");
        }else if (number % 3 != 0 && number % 5 == 0){
            System.out.println(str + "5");
        }else if (number % 3 != 0 && number % 5 != 0){
            System.out.println("khong"+ str + "ca 3 va 5");
        }
    }
}
