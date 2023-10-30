package btvnbai2;

public class btlt {
    public static void main(String[] args) {
        boolean check = true;
        int a = 1;
        while (check){
            if (a%5==0&a%7==0&&a%11==0){
                check=false;
            }else {
                a++;
            }
            if (check==false){
                System.out.println(a);
            }
        }
    }
}
