package btvnbai3.phan2;

public class bai12 {
    public static void main(String[] args) {
        String str = " sao lai san sui the ";
        System.out.println(thayTheKyTu(str));
    }
    public static String thayTheKyTu(String inPut) {
        String str1 = inPut.replace("s","t");
        return str1;
    }
}
