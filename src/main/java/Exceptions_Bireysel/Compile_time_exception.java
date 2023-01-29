package Exceptions_Bireysel;

import java.io.FileInputStream;// FileInputStream class i javanin io kutuphanesindedei.
import java.io.FileNotFoundException;
import java.io.IOException;

public class Compile_time_exception {


    public static void main(String[] args) {


       //  FileInputStream Bu klas app in  insan disi cansiz dunya ile etkilesimini saglar
        // yani  bilgisayarlardan , local oder disaridaki farketmez  veri ceker ,veri gonderir.


        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\Exceptions_Bireysel\\File01.txt");
            // eger hata almadiysan dosyayi oku . Su anda dosyan fissss

            int k =0;
            while ((k=fis.read()) != -1){
                System.out.print((char) k);
            }



        } catch (FileNotFoundException e) {
            System.out.println("dosya adreste bulunamadi veya adres yanlis ");

        } catch (IOException e) {

        }

        System.out.println("Hi");
// compile time error da da handl(aslinda bunun  adi handli etmek olmuyor ) gerekir.
        // istersen thr catch te throws attirirsin ve durdurursun. yani koydugun her try catch hadl etmek olmuyor
        // compile time i susturmak icin yokmus gibi gostettir ama sonra run time da durdur programi .
// Aslinda burdaki handl zorunluluk iste . yoksa run time a gecemisorsun.
// Java kirmizi kaliyor


    }
}
