package advanceday12;

import java.util.Scanner;

public class Faktoryel {
    /*
    Faktoryel hesaplayan metod yaziniz-----(Loop kullnamayiniz)

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        try {
            sayi = input.nextInt();
        } catch (Exception e) {
            System.out.println("sayi diisnda karakter girmeyin");
        }
        int sonuc = 0;//5*sayi(4)//4*sayi(3)
        try {
            System.out.println( faktoryel(sayi));
        } catch (Exception e) {
            System.out.println("sayi sifirdan kucuk olamaz");;
        }

    }



    public static int faktoryel(int sayi) {


        if (sayi < 0){

                throw new IllegalArgumentException();

        } else if (sayi > 1) {
            return sayi * faktoryel(sayi - 1);
        } else if (sayi == 1) {
            return 1;
        }
        return 1;
    }

}


