package Bireysel____Denemeler;

import java.util.Scanner;

public class Eksik_Varargs_advance {

//Ad, soyad, yaş ve bugüne dek yaşanılmış sehirler bilgilerini parametre olarak alıp yazdıran bir method oluşturunuz.


    public static void main(String[] args) {


        seceremetodu("", "", "", "");


    }//main

    private static void seceremetodu(String... arr) {
        Scanner input = new Scanner(System.in);

        String isim ;
        String soyisimgir;
        String yas;
        String sehirler;
        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {

                System.out.println("isim girin");
                isim = input.next();
                System.out.println("isim = " + isim);
            } else if (i==1) {
                System.out.println("soyisim");
               soyisimgir=input.next();
                System.out.println("soyisimgir = " + soyisimgir);
            } else if (i==2) {
                System.out.println("yas gir");
                 yas= input.next();
                System.out.println("yas = " + yas);

            }else {

                for (String w:arr) {
                    System.out.println("sehirleri girin");

                    sehirler= input.next();
                    if(sehirler.equalsIgnoreCase("q")){
                        break;
                    }
                    System.out.println(sehirler);
                    System.out.println("sehirler = " + sehirler);



                }


            }


        }



    }

}//class
//      MAIN METODDA ALT METODLARI CAGIRIRKEN PARAMETRE GONDERECEKSEK DISARDA DATA TIP TANIMLAMAMIYA GEREK YOK: DIRE
// ICINE YAZ:  ALT METOD ALIRKEN GELEN VERIYI YATEN DEGISKEN OLARAK DIREKT ALIYOR:

//            bilgiler("Ali","Can",22,"Ankara","Konya","Erzurum", "Ağrı", "Diyarbakır", "Kayseri");
//            System.out.println();



//            bilgiler2("Ali","Can","22","Ankara","Konya","Erzurum", "Ağrı", "Diyarbakır", "Kayseri");
//            System.out.println();



//            bilgiler2("Ahmet","Tan","33","Hamburg","Bremen", "Berlin");
//        }
//
//        public static void bilgiler(String ad, String soyad, int yas, String... sehirler){
//
//            System.out.println("ad = " + ad);
//            System.out.println("soyad = " + soyad);
//            System.out.println("yas = " + yas);
//            System.out.print("Yaşanılmış sehirler: ");
//            for(String w : sehirler){
//
//                System.out.print(w+" ");
//
//            }
//        }
//
//        public static void bilgiler2(String... bilgiler){
//
//            for(int i=0; i<bilgiler.length; i++){
//                if(i==0){
//                    System.out.println("Ad: "+bilgiler[i]);
//                } else if (i==1) {
//                    System.out.println("Soyad: "+bilgiler[i]);
//                } else if (i==2) {
//                    System.out.println("Yaş: "+bilgiler[i]);
//                    System.out.print("Yaşanılan Şehirler: ");
//                }else {
//                    System.out.print(bilgiler[i]+" ");
//                }
//            }


