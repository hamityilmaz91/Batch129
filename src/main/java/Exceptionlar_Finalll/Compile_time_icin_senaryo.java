package Exceptionlar_Finalll;

import java.util.Scanner;

public class Compile_time_icin_senaryo {

    public static void main(String[] args) throws Yas_sifirdan_kucuk_olamaz_compiletime {


        //  Kullanicidan yasini  istayin ve bunu yazdirin

        System.out.println("Lutfen yasinizi girin");
        Scanner input = new Scanner(System.in);
         int yas = input.nextInt();

         if(yas<0){  // yas kucukse olusturdugum compile time class exception  atilacak .


                 throw new Yas_sifirdan_kucuk_olamaz_compiletime("yas sifirdan kucuk olmaz");

             // yukaridaki kodu yazinca intellij  kizardi.Bu kizarikligi gidermek icin
             //signatura throwS yazip atan exception clasiini ekle.
             // Yani(Yas_sifirdan_kucuk_olamaz_compiletime)
             // sonrasinda kirmizi gidecek. Compile time handl edilmis oldu
             //Ama run time hala sorunlu . Onu da try catch ile halledecem.

             // Not:: Signatura Throws eklemek istemiyorsan direkt kirmizi satiri
             // try catch ile handl et . Hem kompile time hem de run time duzelsin

         }

    }
}
