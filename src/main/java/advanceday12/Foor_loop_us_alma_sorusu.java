package advanceday12;

import java.util.Scanner;

public class Foor_loop_us_alma_sorusu {
    public static void main(String[] args) {

        System.out.println("kuvveti alinacak sayiyi ve kacinci kuvvetinin alinacagini girin");
        Scanner input = new Scanner(System.in);
        double taban=input.nextDouble();
        int us=input.nextInt();
        System.out.println(1.0/256);
       usalmametodu(taban,us);

    }

    private static void usalmametodu(double taban, int us) {


        if(us>0) {
            double carpim = 1;
            for (int i = 1; i <= us; i++) {

                carpim = taban * carpim;
            }
            System.out.println(carpim);
        } else if (us==0 && taban!=0) {
            System.out.println(1);

        }else{double carpim = 1;
            for (int i = 1; i <= (us*-1); i++) {

                carpim = taban * carpim;
            }
            System.out.println(1/carpim);

        }

    }//metod
}//class
