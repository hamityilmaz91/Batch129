package Exceptionlar_Finalll;

import java.util.Scanner;

public class Run_time_icin_senaryo {


    public static void main(String[] args) {


        //  Kullanicidan yasini  isteyin ve bunu yazdirin


        System.out.println("Lutfen yasinizi girin");
        Scanner input = new Scanner(System.in);
        int yas = input.nextInt();

        if (yas < 0) {  // yas kucukse olusturdugum run time class exception  atilacak .

            throw new Yas_sifirdan_kucuk_olamaz_Runtime("yas sifirdan kucuk olmaz ");

            // yukaridaki kodu yazinca intellij  kizarmadi.
            // Cunki ben burada kendi uretiigim      (Yas_sifirdan_kucuk_olamaz_runtime ) clasindan
            // exception attim.
            // BUNDAN DOLAYI BURADA "throwS"  LA HIC ISIM YOK. AKLIMA BILE GETIRMIYORUM.

            // eger handl etmek istiyorsam try catch kullanirim olur biter .
        }
    }
}