package SULE_HOCA_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bizim_olusturdugumuz_metod_2 {

    //ogrenci notlari girisi yapan ve notu consola yazdiran metod olusturunuz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen igrencinin sayisini girinz");
        int sayi = input.nextInt();

        try {
            notgirisiyapanmetod(sayi);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    // eger  throw u biz atiyorsak verdigimiz mesagi e . get ile yazdirabilmek icinn sout icerisine atmaliyiz


    private static void notgirisiyapanmetod(double d) {


        if(d<0){

            throw new IllegalArgumentException("not negatif veya 100 den buyuk olamaz");
        }


        System.out.println(d);




    }


}
