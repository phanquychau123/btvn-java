package btvnbai1;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can doc :");
        int number = Integer.parseInt(sc.nextLine());
        String ones ="";
        String tens = "";
        String hundred = "";
        switch (number) {
            case 0 :
                ones = "zero" ;
                break;
            case 1 :
                ones = "one";
                break;
            case 2 :
                ones = "two";
                break;
            case 3 :
                ones = "three";
                break;
            case 4 :
                ones  = "four";
                break;
            case 5 :
                ones = "five";
                break;
            case 6 :
                ones = "six";
                break;
            case 7 :
                ones = "seven";
                break;
            case 8 :
                ones = "eight";
                break;
            case 9 :
                ones = "nine";
                break;
            case 10 :
                ones = "ten";
                break;
            default:
                break;
            }
            switch ((number / 10) % 10){
                case 1:
                    switch (number /10){
                        case 0:
                            tens = "ten" ;
                            break;
                        case 1 :
                            tens = "eleven";
                            break;
                        case 2 :
                            tens = "twelve";
                            break;
                        case 3 :
                            tens = "thirteen";
                            break;
                        case 4 :
                            tens = "fourteen";
                            break;
                        case 5 :
                            tens = "fifteen";
                            break;
                        case 6 :
                            tens = "sixteen";
                            break;
                        case 7 :
                            tens = "seventeen";
                            break;
                        case 8 :
                            tens = "eighteen";
                            break;
                        case 9 :
                            tens = "nineteen";
                            break;
                    }
                case 2 :
                    tens = "twenty" ;
                    break;
                case 3 :
                    tens = "thirty" ;
                    break;
                case 4 :
                    tens = "fourty" ;
                    break;
                case 5 :
                    tens = "fifty" ;
                    break;
                case 6 :
                    tens = "sixty" ;
                    break;
                case 7 :
                    tens = "seventy" ;
                    break;
                case 8 :
                    tens = "eigthty" ;
                    break;
                case 9 :
                    tens = "ninety" ;
                    break;

        }
        switch (number/ 100){
            case 1 :
                hundred = "one";
                break;
            case 2 :
                hundred = "two";
                break;
            case 3 :
                hundred = "three";
                break;
            case 4 :
                hundred  = "four";
                break;
            case 5 :
                hundred = "five";
                break;
            case 6 :
                hundred = "six";
                break;
            case 7 :
                hundred = "seven";
                break;
            case 8 :
                hundred = "eight";
                break;
            case 9 :
                hundred = "nine";
                break;
            default:
                break;  
        }
        if (number<0 && number>999){
            System.out.println("out of ability");
        } else if (number >= 0 && number < 10) {
            System.out.println(ones);
        }else if (number >= 10 &&  number < 20){
            System.out.println(tens);
        } else if (number>=20 && number<100) {
            System.out.println(tens+""+ones);
        } else if (number>=100&&number<=999) {
            if (number%100==0){
                System.out.println(hundred + "hundred");
                
            } else{
               if ((number/10)%10 == 1) {
                    System.out.println(hundred+"hundred"+tens);
            }else {
                   System.out.println(hundred+"hundred"+tens+""+ones);
               }

                
            }

        }
    }
}
