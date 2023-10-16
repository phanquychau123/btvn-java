import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can chuyen doi");
        int number = Integer.parseInt(sc.next());
        switch (number){
            case 0 :
            System.out.println("so khong");
            break;
            case 1 :
                System.out.println("so mot");
                break;
            case 2:
                System.out.println("so hai");
                break;
            case 3 :
                System.out.println("so ba");
                break;
            case 4 :
                System.out.println("so bon");
                break;
            case 5 :
                System.out.println("so nam");
                break;
            case 6 :
                System.out.println("so sau");
                break;
            case 7 :
                System.out.println("so bay");
                break;
            case 8 :
                System.out.println("so tam");
                break;
            case 9 :
                System.out.println("so chin");
                break;
            default:
                System.out.println("so ko hop le");
                break;
        }

    }
}
